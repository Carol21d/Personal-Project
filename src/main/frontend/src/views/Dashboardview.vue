<script setup>
import Navbar from "../components/Navbar.vue";
import Categories from "../components/Categories.vue";
import RecommendedRoutes from "../components/RecommendedRoutes.vue";
import Greeting from "../components/Greeting.vue";
import SocialNetwork from "../components/SocialNetwork.vue"
</script>
<template>
  <div class="background">
    <div class="container">
      <Greeting class="saludo"/>
      <SocialNetwork/>

    </div>
    <Navbar />
    <v-container fluid>
      <v-row class="wrapper">
        <v-col class="categorias" cols="8">
          <Categories />
        </v-col>
        <v-col cols="4">
          <RecommendedRoutes />
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>
<style lang="scss" scope>
body {
  margin: 0;
  padding: 0;
}
.background {
  
  overflow: auto;
  background-image: url("../../src/assets/images/bg6.jpg");
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100;
  z-index: -1;
  background-size: cover;
}

.container{
  .saludo{
    display: flex;
    position: absolute;
    left: 10%;
  }
}
.navbar {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 100;
}
.wrapper {
  //usamos !important por si hay una regla css esta tenga mas relevancia que la otra.Mala practica
  margin-left: 20px !important;
}
</style>





