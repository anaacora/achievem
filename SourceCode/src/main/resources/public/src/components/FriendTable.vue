<template>
    <div class="col border mr-3 ml-2 pt-3 pb-2 rounded">
                <div class="text-center">
                    <h5 class="font-weight-bold"><span>Your friends</span></h5>
                </div>
                <table class="table table-borderless text-right">
                    <tbody>
                        <tr class="font-weight-bold">
                            <th scope="row" class="text-center">
                                <img 
                                    v-bind:src="[user.profile]" 
                                    alt="Profile" 
                                    class="img-friend-table rounded-circle"
                                    >
                            </th>
                            <td class="text-left align-middle">{{user.name}}</td>
                            <td class="align-middle">{{user.totalScore}}</td>
                            <td class="align-middle">Lvl. {{user.level}}</td>
                        </tr>

                        <tr v-for="friend in friends" :key="friend.id">
                            <th scope="row" class="text-center">
                                <img 
                                    v-bind:src="[friend.profile]" 
                                    alt="Profile" 
                                    class="img-friend-table rounded-circle"
                                    >
                            </th>
                            <td class="text-left align-middle">{{friend.name}}</td>
                            <td class="align-middle">{{friend.totalScore}}</td>
                            <td class="align-middle">Lvl. {{friend.level}}</td>
                        </tr>
                    </tbody>
                </table>
                <div class="text-center">
                    <button type="button" class="btn btn-dark mb-2" data-toggle="modal" data-target="#ModalChallengeAFriend">Challenge a friend</button>
                </div>
            </div>
</template>

<script>
export default {
  props: ['user', 'friends'],
  data(){
    return{
      textCustom50: "txt-custom-"+this.goal.goalColor+"-50",
      backgroundCustom50: "bg-custom-"+this.goal.goalColor+"-50",
      backgroundCustom70: "bg-custom-"+this.goal.goalColor+"-70",

      valNow: this.goal.goalCurrent/this.goal.goalTarget*100,
      valOpen: 100-this.goal.goalCurrent/this.goal.goalTarget*100,
    }
  },

  mounted() {
  },
  
  methods: {
  },
}
</script>

<style scoped>
.img-score {
    height: 150px;
    width: 150px;
}

.img-friend-table {
    height: 40px;
    width: 40px;
}

.img-awards-profile {
    height: 25px;
    width: 25px;
}
</style>