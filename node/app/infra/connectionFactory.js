var mysql = require('mysql');

function createDBConnection() {
  return mysql.createConnection({
    host : 'localhost',
    user : 'root',
    password : 'admin',
    database : 'curso_nodejs'
  });
}

//wrapper
module.exports = function() {
  return createDBConnection;
};
