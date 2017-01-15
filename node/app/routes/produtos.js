module.exports = function(app) {

  app.get('/produtos', function(req, res, next){
    var connection = app.infra.connectionFactory();
    var produtosDAO = new app.infra.ProdutosDAO(connection);

    produtosDAO.lista(function(err, results) {
      if (err) {
        return next(err);
      }
      res.format({
        html: function() {
          res.render('produtos/lista', {lista: results});
        },
        json: function(){
          res.json(results);
        }
      });
    });

    connection.end();
  });

  app.get('/produtos/form', function(req, res){
    res.render('produtos/form', {erros:{}, produto:{}});
  });

  app.post('/produtos', function(req, res, next){

    var produtoReq = req.body;
    req.assert('titulo', 'Titulo é obrigatorio').notEmpty();
    req.assert('preco', 'Formato invalido').isFloat();

    var listaErros = req.validationErrors();
    if (listaErros) {
      res.format({
        html: function() {
          res.status(400).render('produtos/form', {erros: listaErros, produto: produtoReq});
        },
        json: function() {
          res.status(400).json(listaErros);
        }
      });
      return;
    }

    var connection = app.infra.connectionFactory();
    var produtosDAO = new app.infra.ProdutosDAO(connection);

    produtosDAO.salvar(produtoReq, function(err, results){
      if (err) {
        return next(err);
      }
      res.redirect('/produtos');
    });
  });

};
