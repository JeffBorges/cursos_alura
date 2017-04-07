<template>
  <div>
    <h1>{{ titulo }}</h1>
    <ul>
      <li v-for="foto of fotos">
        <img :src="foto.url" :alt="foto.titulo">
      </li>
    </ul>
  </div>
</template>

<script>
export default {
 data() {
   return {
     titulo: 'Alurapic',
     fotos: [
      {
        url: 'http://www.farejadordecaes.com.br/wp-content/uploads/o-que-saber-antes-de-comprar-cachorro-01.png',
        titulo: 'Cachorro',
      },
      {
        url: 'http://meusanimais.com.br/wp-content/uploads/2015/03/4-gato-enfermo.jpg',
        titulo: 'Gato',
      },
    ]
   }
 }
}
</script>

<style>

</style>
