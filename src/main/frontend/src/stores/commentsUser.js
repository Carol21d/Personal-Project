import {defineStore} from "pinia";
import axios from "axios";

export const commentsStore = defineStore("commentsStore",{
    state: () => ({
        comments: [],
    }),


    actions:{
        async  saveComments(comment){
            try{
                const response = await axios.post("http://localhost:8080/api/comments",comment);
                console.log(response.status);
            }catch(error){
                console.error(error);
            }
        },


        async editComment(comment, id){
            try{
                const response = await axios.put("http://localhost:8080/api/comments", comment);
                console.log(response.status);
            }catch(error){
                console.error(error);

            }
        },

        async deleteComments(id) {
            try{
                const response = await axios.de
            }

        }
    }
})