module.exports = function(app) {
  app.get('/produtos', function(req, res){
    var mysql = require('mysql');
    var connection = mysql.createConnection({
      host : 'localhost',
      user : 'root',
      password : 'admin',
      database : 'curso_nodejs'
    });

    connection.query('select * from livros', function(err, results) {
      res.send(results);
    });
    connection.end();
  });
};
