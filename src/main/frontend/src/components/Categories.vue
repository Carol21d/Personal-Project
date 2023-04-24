<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';


const router = useRouter();
const items = ref([
  { src: "../../src/assets/images/mixto.jpg", route: "/combined", category: "Mixed Routes" },
  { src: "../../src/assets/images/escala.jpg", route: "/climbing", category: "Climbing Routes" },
  { src: "../../src/assets/images/dogs.png", route: "/pets", category: "Pet Friendly Routes" },
  { src: "../../src/assets/images/aqua.jpg", route: "/aquactic", category: "Aquatic Routes" },
  { src: "../../src/assets/images/montana.jpg", route: "/mountains", category: "Mountains Routes" },
  { src: "../../src/assets/images/senderismo.jpg", route: "/bikes", category: "Hiking Routes" },
]);

const transparent = ref("rgba(255, 255, 255, 0)");

const clickHandler = (index) => {
  router.push(items.value[index].route);
};
</script>

<template>
  <div class="text-left relative">
    <v-card-title class="categorias text-h6 text-md-h5 font-italic text-lg-h4">Categories</v-card-title>
  </div>
  <v-container class="container  fill-height" fluid>
    <v-fade-transition mode="out-in">
      <v-row>
        <v-col cols="6" md="4" class="galeria ml-4" v-for="(item, index) in items" :key="index">
          <v-img :src="item.src" height="160" cover class="img" @click="clickHandler(index)">
            <div class="categoria">{{ item.category }}</div>
          </v-img>
        </v-col>
      </v-row>
    </v-fade-transition>
  </v-container>
</template>

<style lang="scss" scoped>
body {
  margin: 0;
  padding: 0;
}
.background {
  
  overflow: hidden;
  background-image: url("../../src/assets/images/bg6.jpg");
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  z-index: -1;
  object-fit: contain;
}


.categorias {
  position: absolute;
  left: 10.9%;
  top: 17%;
  font-family: Kalam !important;
  font-size: 40px;
  font-style: italic;
  font-weight: 600;
  color: white;
}

.container {
  display: flex;
  position: relative;
  left: 10.2%;
  bottom: 17%;

  

  .galeria {
    padding: 14px;
    position: relative;
    bottom: 20px;

    .img {
     
       position: relative;
       overflow: hidden;
       .categoria {
         position: absolute;
         bottom: 0;
         left: 0;
         width: 100%;
         padding: 5px;
         background-color: rgba(0,0,0,0.7);
         color:white;
         font-weight: bold;
         font-size: 16px;
         text-align: center;
         transform: translateY(100%);
         transition: transform 0.3s ease;
        }
       
        &:hover .categoria{
          transform: translateY(0);
        }
      }
    }
  
  }
</style>
        







          









