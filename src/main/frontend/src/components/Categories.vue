<script >


export default {
  data: () => ({
    items: [
      { src: "../../src/assets/images/combinados.png" },
      { src: "../../src/assets/images/escalada.png" },
      { src: "../../src/assets/images/pet.png" },
      { src: "../../src/assets/images/acuaticos.png" },
      { src: "../../src/assets/images/mountain.png" },
      { src: "../../src/assets/images/senderismo.png" },
    
    ],
  }),
};
</script>

<template>
   <v-container class="fill-height" fluid>
    <v-fade-transition mode="out-in">
      <v-row>
        <v-col cols="6" md="4" class="galeria ml-4 " v-for="(item, index) in items" :key="index">
          <v-img :src="item.src" height="120" contain class="grey darken-4"></v-img>
        </v-col>
      </v-row>
      
    </v-fade-transition>
  </v-container>
</template>
<style lang="scss" scoped>

.galeria{
  padding: 13px;
}
</style>
