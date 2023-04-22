<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';


const router = useRouter();
const items = ref([
  { src: "../../src/assets/images/combinados.png", route: "/combined", category: "Mixed Routes" },
  { src: "../../src/assets/images/escalada.png", route: "/climbing", category: "Climbing Routes" },
  { src: "../../src/assets/images/pet.png", route: "/pets", category: "Pet Friendly Routes" },
  { src: "../../src/assets/images/acuaticos.png", route: "/aquactic", category: "Aquatic Routes" },
  { src: "../../src/assets/images/mountain.png", route: "/mountains", category: "Mountains Routes" },
  { src: "../../src/assets/images/senderismo.png", route: "/bikes", category: "Hiking Routes" },
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
  <v-container class="container fill-height" fluid>
    <v-fade-transition mode="out-in">
      <v-row>
        <v-col cols="6" md="4" class="galeria ml-4" v-for="(item, index) in items" :key="index">
          <v-img :src="item.src" height="120" cover class="img" @click="clickHandler(index)">
            <div class="categoria">{{ item.category }}</div>
          </v-img>
        </v-col>
      </v-row>
    </v-fade-transition>
  </v-container>
</template>

<style lang="scss" scoped>
.categorias {
  position: absolute;
  left: 10.9%;
  top: 19%;
  font-family: Kalam !important;
  font-size: 40px;
  font-style: italic;
  font-weight: 600;
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
      // transform: translateY(-5px);
      // box-shadow: 0px 2px 21px 7px rgba(0, 0, 0, 0.51);
      // transition: transform 0.3s ease, box-shadow 0.3s ease;
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
        







          









