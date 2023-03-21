<script>
export default {
  data() {
    return {
      drawer: true,
      items: [
        { title: "Search", icon: "mdi-magnify" },
        { title: "Home", icon: "mdi-home" },
        { title: "Categories", icon: "mdi-view-dashboard" },
      ],
      rail: true,
    };
  },
};
</script>
<template>
  <v-card>
    <v-layout >
      <v-navigation-drawer  v-model="drawer" :rail="rail" permanent @click="rail = false" >
       

          <v-list-item   prepend-avatar="../../src/assets/images/logo.png"  title="RUTEROS" nav>
            <template v-slot:append>
              <v-btn  variant="text" icon="mdi-chevron-left" @click.stop="rail = !rail"></v-btn>
            </template>
          </v-list-item>

         
     
        <v-divider></v-divider>

        <v-list density="compact" nav>
          <v-list-item prepend-icon="mdi-magnify" title="Search"  value="search"></v-list-item>
          <v-list-item prepend-icon="mdi-home" title="Home" value="home"></v-list-item>
          <v-list-item prepend-icon="mdi-view-dashboard" title="Categories" value="categories"></v-list-item>
        </v-list>
      </v-navigation-drawer>
      <v-main style="height: 10vh">
        <v-card-title class="title justify-space-between font-italic text-h6 text-md-h5 text-lg-h4">Hola, Ruteros!!!
          <v-img :width="100" aspect-ratio="1/1" cover src="../assets/images/socialnetwork.png"></v-img>
        </v-card-title>
    </v-main>
    </v-layout>
  </v-card>
</template>
<style lang="scss" scoped>

.v-list-item prepend-avatar {
  width: 80px;
  height: 80px;
  border-radius: 50%;
}

  .title {
    position: absolute;
    top: .7rem;
    font-family: Kalam;
    font-size:45px;
    font-weight: 400;
   
  
  }


</style>
