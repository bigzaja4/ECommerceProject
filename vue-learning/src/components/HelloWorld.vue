<template>
  <div class="hello">
      <h1> {{user}} </h1>
      <!-- <h1 v-for="item in list" v-if="verifyName(item)" :key="item"> {{item}}</h1>  -->
      <!-- <h1 v-for="item in user" :key=item> {{item}} </h1>      -->
  </div>
</template>

<script>
import axios from "axios"
axios.defaults.withCredentials = true;
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return{
      firstName: 'Big Big',
      list: ['Dell' , 'Big' , 'Test'],
      user: {}
    }
  },
  methods: {
     verifyName: function(inputName){
        let res = false;
        if(inputName == 'Big'){
          res = true;
        }
        return res;
     },
     getMessage: async function(){
        let user = await axios.get('http://localhost:8099/');   
        this.user = user.data;
        console.log(this.user)
     }
  },
  mounted() {
    this.getMessage();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
