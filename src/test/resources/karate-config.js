function fn() {
var env = karate.env;
var baseUrl = '';

karate.log('Se realiza la ejecución en el entorno: ' + env);


    if (!env) {
  env = 'dev';
   }

    if (env === 'dev') {
        baseUrl = 'https://petstore.swagger.io/v2';
    } else if (env === 'qa') {
        baseUrl = 'https://petstore.swagger.io/v2';
    }

  var config = {
    baseUrl: baseUrl,
    env: env,
  }
    return config;

}


