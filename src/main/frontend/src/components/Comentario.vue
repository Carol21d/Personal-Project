<script>
export default {
  data: () => ({
    dialog:false,
    valid: true,
    nameUser: '',
    nameRules: [
      v => !!v || ' Name is required',
      v => (v && v.length <= 10) || 'Name must be less than 10 characters',
    ],
    comentario: '',
    comentarioRules: [
      v => !!v || 'Comentario is required',
      v => (v && v.length <= 100) || 'Comentario must be less than 100 characters',
    ],

  }),

  methods: {
    async validate() {
      const { valid } = await this.$refs.form.validate();
      if (valid) alert('Form is valid');
    },

  },
}




// import { ref, onMounted } from "vue";
// //declaramos nuestras variables
// const dialog = ref(false);
// const valid = ref(true);
// const name = ref("");
// const comentario = ref("");
// const form = ref(null);
// // validaciones
// const nameRules = [(v) => !!v || "Name is required"];

// // funcion validate
// const validate = () => {
//   if (form.value) {
//     const { valid } = form.value.validate();
//     if (valid) {
//       alert("comentario is valid");
//     }
//   }
// };
</script>

<template><!--quitamos mt-12-->
  <v-row class=" justify-center">
    <v-dialog v-model="dialog" persistent width="600px">
      <template v-slot:activator="{ props }">
        <v-btn color="primary" v-bind="props"> AÑADIR COMENTARIO </v-btn>
      </template>
      <v-card>
        <v-card-title>
          <span class="text-h5">FORMULARIO DE COMENTARIOS</span>
        </v-card-title>
        <v-card-text>
          <!--formulario y validaciones empiezan aqui-->
          <v-form ref="form">
            <v-container>
              <v-row>
                <v-col cols="12" sm="6" md="4">
                  <v-text-field v-model="nameUser" label="Name*" :rules="nameRules" required></v-text-field>
                </v-col>
                <v-col cols="12">
                  <v-textarea v-model="comentario" :rules="comentarioRules" required auto-grow variant="filled"
                    color="deep-purple" label="Comentario*" rows="3"></v-textarea>
                </v-col>
              </v-row>
            </v-container>
          </v-form>

          <small>*indicates required field</small>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color="blue-darken-1" variant="text" @click="dialog = false">
            Close
          </v-btn>
          <v-btn color="blue-darken-1" variant="text" @click="validate">
            Save
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </v-row>
</template>
