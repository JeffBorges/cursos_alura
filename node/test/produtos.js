var express = require('../config/express')();
var request = require('supertest')(express);

describe('#ProdutosController', function(){

  it('#listagem json', function(done){
    request.get('/produtos')
      .set('Accept', 'application/json')
      .expect('content-type', /json/)
      .expect(200, done);
  });

  it('#listagem html', function(done){
    request.get('/produtos')
      .expect('content-type', /html/)
      .expect(200, done);
  });

  it('#cadastror de novo produto com dados invalidos', function(done) {
    request.post('/produtos')
      .send({titulo: "", descricao: "novo livro"})
      .expect(400, done);
  });

  it('#cadastror de novo produto com dados validos', function(done) {
    request.post('/produtos')
      .send({titulo: "tirulo", preco: 50.5, descricao: "novo livro"})
      .expect(302, done);
  });

});
