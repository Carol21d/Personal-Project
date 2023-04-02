<script>
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
    transparent: "rgba(255, 255, 255, 0)",
  }),
};
</script>

<template>
  <div class="text-left relative">
    <v-card-title class="categorias text-h6 text-md-h5 font-italic text-lg-h4">Categorias</v-card-title>
  </div>
  <v-container class="fill-height" fluid>
    <v-fade-transition mode="out-in">
      <v-row>
        <v-col cols="6" md="4" class="galeria ml-4" v-for="(item, index) in items" :key="index">
          <v-img :src="item.src" height="120" aspect-ratio="16/9" cover class="img"></v-img>
        </v-col>
      </v-row>
    </v-fade-transition>
  </v-container>
</template>
<style lang="scss" scoped>
.categorias {
  position: absolute;
  left: 65px;
  top: 185px;
      font-family: Kalam  !important;
      font-size: 40px;
      font-style: italic;
      font-weight: 600;

  .galeria {
    padding: 14px;
    position: relative;
    bottom: 20px;

    .img:hover {
      transform: translateY(-5px);
      box-shadow: 0px 2px 21px 7px rgba(0, 0, 0, 0.51);
      transition: transform 0.3s ease, box-shadow 0.3s ease;
    }
  }
}
</style>
