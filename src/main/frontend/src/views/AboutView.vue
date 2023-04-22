<script setup>
import Navbar from '../components/Navbar.vue';
import Comentario from '../components/Comentario.vue';
import EditComentario from '../components/EditComentario.vue';
import Greeting from '../components/Greeting.vue';
import SocialNetwork from '../components/SocialNetwork.vue'
</script>
<template>
  <div class="container">
    <Greeting class="saludo d-flex"/>
    <SocialNetwork/>
  </div>
  <v-card-title class="comentarios d-flex text-h6 text-md-h5 font-italic text-lg-h4">Comments</v-card-title>
  <div class="wrapper">

    <!-- <v-avatar class="avatar" size="60">
      <v-img contain aspect-ratio="16/9" src="../src/assets/images/avatar2.png" alt="avatar-user"></v-img>
    </v-avatar> -->
    <Comentario />
    <EditComentario/>
    <Navbar />
  </div>
</template>

<style lang="scss" scoped>
// .wrapper{
//   background-color: whitesmoke;
//   width: 500px;
//   height: 100px;
//   border-radius: 10px;
//   border: 2px solid black;
 
//   .avatar{
//     bottom:25px;
//     right: 12px;
//   }
// }
// 
.comentarios{
  position:absolute;
  left: 54%;
  top: 15%;
}
</style>
