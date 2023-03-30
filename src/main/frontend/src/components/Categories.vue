<script setup>
</script>

<template>
  <v-row>
      <v-col
        v-for="n in 6"
        :key="n"
        class="d-flex child-flex"
        cols="6"
      >
        <v-img 
          :src="`https://picsum.photos/500/300?image=${n * 5 + 10}`"
         
          aspect-ratio="1/4"
          cover
          class="bg-grey-lighten-2"
        >
          <template v-slot:placeholder>
            <v-row
              class="h-64 mt-32"
              align="center"
              justify="center"
            >
             
            </v-row>
          </template>
        </v-img>
      </v-col>
    </v-row>
</template>
<style lang="scss" scoped>
.v-img__img{
    width: 30px;
}
</style>