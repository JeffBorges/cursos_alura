var mysql = require('mysql');

function createDBConnection() {

  if (!process.env.NODE_ENV) {
    return mysql.createConnection({
      host : 'localhost',
      user : 'root',
      password : 'admin',
      database : 'curso_nodejs'
    });
  }

  if (process.env.NODE_ENV == 'test') {
    return mysql.createConnection({
      host : 'localhost',
      user : 'root',
      password : 'admin',
      database : 'curso_nodejs_test'
    });
  }

  if (process.env.NODE_ENV == 'production') {
    var url = process.env.CLEARDB_DATABASE_URL;
    var grupos = url.match(/mysql:\/\/(.*):(.*)@(.*)\/(.*)\?/);
    return mysql.createConnection({
        host:grupos[3],
        user:grupos[1],
        password:grupos[2],
        database:grupos[4]
    });
  }

}

//wrapper
module.exports = function() {
  return createDBConnection;
};
