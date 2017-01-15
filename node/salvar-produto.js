var http = require('http');

var configuracoes = {
  hostname: 'localhost',
  port: 3000,
  path: '/produtos',
  method: 'post',
  headers:{
    'Accept': 'application/json',
    'Content-Type': 'application/json'
  }
};

var res = http.request(configuracoes, function(res){
  console.log(res.statusCode);
  res.on('data', function(body){
    console.log('Corpo: '+ body);
  });
});

var produto = {
  'titulo': 'Teste Json',
  'preco': 50,
  'descricao': 'Teste Json'
};

res.end(JSON.stringify(produto));
