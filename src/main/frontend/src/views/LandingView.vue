<script>
// import  { useRouter } from 'vue-router';

//click al enter de dashboard

// const landing = () => {
// const router = useRouter();
// router.push('/dashboard');

// }
  export default {
    name: 'LandingView',
    methods: {
      landing(){
        this.$router.push('/dashboard');
      }
    }
  }







</script>
<template>
  <main>
    <div class="wrapper-container">
      <p>We are going to explore!!!</p>
      <div class="wrapper--btn d-flex justify-space-between">
        <v-btn variant="tonal" color="black" size="x-large" class="btn--enter"  @click="landing">ENTER</v-btn>
      </div>
    </div>
  </main>
</template>
<style lang="scss" scoped>
main {
  background-image: url("../assets/images/b5.jpg");
  background-size: cover;
  width: 100%;
  background-position: 100%;
  background-size: center/100%;
  height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;

  .wrapper-container {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;

    p {
      position: relative;
      bottom: 130px;
      color: aliceblue;
      font-family: Kalam;
      font-size: 70px;
      font-style: italic;
      font-weight: 600;
    }

    .wrapper--btn {
      .btn--enter {
        position: relative;
        right: 6px;
        background-color: aliceblue;
        width: 25vh;
      }
    }
  }

  @media (min-width: 390px) {}
}
</style>
