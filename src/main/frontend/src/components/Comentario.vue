<script setup>
import { ref, defineProps } from "vue";
import { commentsStore } from "../stores/commentsUser";

const props = defineProps({
  id: {
    type: Number,
  },
  comment: {
    type: String,
  },
  name: {
    type: String,
  }
})


const dialog = ref(false);
const name = ref("");
const comment = ref("");
const commentstore = commentsStore();


function send() {
  const comments = {
    name: name.value,
    comment: comment.value,
  };
  commentstore.saveComments(comments)
};

const resetForm = () => {
  name.value = "";
  comment.value = "";
};

</script>

<template>
  <v-row class=" justify-center">
    <div class="container-comentario">
      <v-avatar class="avatar" size="80">
        <v-img contain aspect-ratio="16/9" src="../src/assets/images/avatar2.png" alt="avatar-user"></v-img>
      </v-avatar>


      <v-dialog v-model="dialog" persistent width="600px">
        <template v-slot:activator="{ props }">
          <v-btn color="primary" class="btn-comentario" v-bind="props"> ADD COMMENTS </v-btn>
        </template>
        <v-card>
          <v-card-title>
            <span class="text-h5">COMMENTS FORM</span>
          </v-card-title>
          <v-card-text>
            <!--formulario y validaciones empiezan aqui-->
            <v-form>
              <v-container>
                <v-row>
                  <v-col cols="12" sm="6" md="4">
                    <v-text-field v-model="name" label="Name*"></v-text-field>
                  </v-col>
                  <v-col cols="12">
                    <v-textarea v-model="comment" label="Comments*" auto-grow variant="filled" color="deep-purple"
                      rows="3"></v-textarea>
                  </v-col>
                </v-row>
              </v-container>
            </v-form>
            <small>*indicates required field</small>
          </v-card-text>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn color="blue-darken-1" variant="text" v-on:click="dialog = false; resetForm()">Close</v-btn>
            <v-btn color="blue-darken-1" variant="text" v-on:click=" send() "> Save</v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
    </div>
  </v-row>
</template>
<style lang="scss" scoped>
.container-comentario {
  display: flex;
  position: absolute;
  left: 54%;
  top: 25%;
  background-color: whitesmoke;
  width: 43%;
  height: 16%;
  border-radius: 10px;
  border: 2px solid black;

  .avatar {
    bottom: 25%;
    right: 1%;
  }

  .btn-comentario {
    display: flex;
    position: absolute;
    left: 60%;
    top: 55%;
  }
}
</style>





















