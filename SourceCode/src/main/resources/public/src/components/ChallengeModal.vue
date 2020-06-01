<template>
  <div class="modal fade" id="ModalChallengeAFriend" tabindex="-1" role="dialog" aria-labelledby="MLabelCAF" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="MLabelCAF">Challenge a friend</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
      </button>
                </div>
                <div class="modal-body">
                    <div class="row mb-3">
                        <div class="col">
                            <ul class="list-group">
                                <p class="mt-3">What goal do you want to challenge?</p>

                                <li class="list-group-item list-group-item-action list-group-item-light" v-for="goal in goals" :key="goal.id">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <span>{{goal.goalTitle}}</span>
                                        <span v-bind:class="'txt-custom-'+[goal.goalColor]+'-50'">{{goal.goalCategory}}</span>
                                    </div>
                                </li>

                                <p class="mt-3">Who do you want to challenge?</p>

                                <li class="list-group-item list-group-item-action list-group-item-light" v-for="friend in friends" :key="friend.id">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="col p-0 text-left">
                                            <img 
                                    v-bind:src="[friend.profile]" 
                                    alt="Profile" 
                                    class="img-awards-profile rounded-circle"
                                    >
                                            <span>{{friend.name}}</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>{{friend.totalScore}}</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>Lvl. {{friend.level}}</span>
                                        </div>
                                    </div>
                                </li>

                            </ul>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Challenge!</button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  props: ['goals', 'friends'],
  data(){
    return{
    }
  },

  mounted() {

  },
  
  methods: {

  }
}
</script>

<style scoped>

.img-awards-profile {
    height: 25px;
    width: 25px;
}

.img-awards {
    height: 75px;
    width: 75px;
}
</style>