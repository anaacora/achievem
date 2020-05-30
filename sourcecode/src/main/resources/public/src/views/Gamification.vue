<template>
  <div class="gamification">
    <div class="container-fluid">

        <div class="row mb-3">
            <div class="col d-flex justify-content-center">
                <h3>Your Points</h3>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col d-flex justify-content-center muted">
                <img src="../img/profile_ana.png" alt="Profile" class="img-score rounded-circle">
            </div>
        </div>

        <div class="row mb-3">
            <div class="col d-flex justify-content-center muted">
                <div>
                    <h4 class="no-space hovering font-weight-bold">1'350<i class="fas fa-share-alt hovering ml-1"></i></h4>
                </div>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col border text-center ml-3 mr-2 rounded align-middle">
                <h5 class="font-weight-bold mt-5"><span>Level</span></h5>
                <h2 class="font-weight-bold"><span>8</span></h2>
                <div class="progress">
                    <div class="progress-bar bg-custom-grey-50" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                    <div class="progress-bar bg-custom-grey-70" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                </div>
                <p class="mt-2">Next level in 550 points</p>
                <!-- <h5 class="font-weight-bold"><span>Rookie</span></h5> -->
            </div>
            <div class="col border mr-3 ml-2 pt-3 pb-2 rounded">
                <div class="text-center">
                    <h5 class="font-weight-bold"><span>Your friends</span></h5>
                </div>
                <table class="table table-borderless text-right">
                    <tbody>
                        <tr class="font-weight-bold">
                            <th scope="row" class="text-center">
                                <img src="../img/profile_ana.png" alt="Profile" class="img-friend-table rounded-circle">
                            </th>
                            <td class="text-left align-middle">Me</td>
                            <td class="align-middle">1'350</td>
                            <td class="align-middle">Lvl. 8</td>
                        </tr>
                        <tr>
                            <th scope="row" class="text-center">
                                <img src="../img/profile_denise.png" alt="Profile" class="img-friend-table rounded-circle">
                            </th>
                            <td class="text-left align-middle">Denise</td>
                            <td class="align-middle">1'300</td>
                            <td class="align-middle">Lvl. 8</td>
                        </tr>
                        <tr>
                            <th scope="row" class="text-center align-middle">
                                <img src="../img/profile_christian.png" alt="Profile" class="img-friend-table rounded-circle">
                            </th>
                            <td class="text-left align-middle">Christian</td>
                            <td class="align-middle">950</td>
                            <td class="align-middle">Lvl. 7</td>
                        </tr>
                    </tbody>
                </table>
                <div class="text-center">
                    <button type="button" class="btn btn-dark mb-2" data-toggle="modal" data-target="#ModalChallengeAFriend">Challenge a friend</button>
                </div>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <ul class="list-group">
                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <span>Challenge win: Against</span>
                                <img src="../img/profile_denise.png" alt="Profile" class="img-awards-profile rounded-circle">
                                <span>Denise</span>
                                <p class="txt-custom-purple-50 m-0">+ 100</p>
                            </div>
                            <div>
                                <img src="../img/100_points.png" alt="Award" class="img-awards">
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <span>Streak 3x:</span>
                                <span>Completed daily goals 3 times in a row</span>
                                <p class="txt-custom-blue-50 m-0">+ 200</p>
                            </div>
                            <div>
                                <img src="../img/200_points.png" alt="Award" class="img-awards">
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <span>Completed all goals for today</span>
                                <span>(05.03.)</span>
                                <p class="txt-custom-purple-50 m-0">+ 100</p>
                            </div>
                            <div>
                                <img src="../img/100_points.png" alt="Award" class="img-awards">
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <span>Completed all goals for today</span>
                                <span>(04.03.)</span>
                                <p class="txt-custom-purple-50 m-0">+ 100</p>
                            </div>
                            <div>
                                <img src="../img/100_points.png" alt="Award" class="img-awards">
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <span>Challenge win: Against</span>
                                <img src="../img/profile_christian.png" alt="Profile" class="img-awards-profile rounded-circle">
                                <span>Christian</span>
                                <p class="txt-custom-purple-50 m-0">+ 100</p>
                            </div>
                            <div>
                                <img src="../img/100_points.png" alt="Award" class="img-awards">
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <span>Completed goal:</span>
                                <span>Eat a fruit</span>
                                <p class="txt-custom-orange-50 m-0">+ 50</p>
                            </div>
                            <div>
                                <img src="../img/50_points.png" alt="Award" class="img-awards">
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">
                        <div class="d-flex justify-content-between align-items-center">
                            <div>
                                <span>Completed goal:</span>
                                <span>Drink 2l water</span>
                                <p class="txt-custom-orange-50 m-0">+ 50</p>
                            </div>
                            <div>
                                <img src="../img/50_points.png" alt="Award" class="img-awards">
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>


    <!-- Modals -->

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
                                <li class="list-group-item list-group-item-action list-group-item-light">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <span>Drink 2l water</span>
                                        <span class="txt-custom-blue-50">Health & Food</span>
                                    </div>
                                </li>
                                <li class="list-group-item list-group-item-action list-group-item-light">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <span>Eat 3 fruits</span>
                                        <span class="txt-custom-blue-50">Health & Food</span>
                                    </div>
                                </li>
                                <li class="list-group-item list-group-item-action list-group-item-light">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <span>Read 20 book pages</span>
                                        <span class="txt-custom-purple-50">Education</span>
                                    </div>
                                </li>
                                <li class="list-group-item list-group-item-action list-group-item-light goal_done">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <span>Go to the gym</span>
                                        <span class="txt-custom-orange-50">Sports</span>
                                    </div>
                                </li>



                                <p class="mt-3">Who do you want to challenge?</p>
                                <li class="list-group-item list-group-item-action list-group-item-light">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="col p-0 text-left">
                                            <img src="../img/profile_denise.png" alt="Profile" class="img-awards-profile rounded-circle">
                                            <span>Denise</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>1'300</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>Lvl. 8</span>
                                        </div>
                                    </div>
                                </li>
                                <li class="list-group-item list-group-item-action list-group-item-light">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="col p-0 text-left">
                                            <img src="../img/profile_christian.png" alt="Profile" class="img-awards-profile rounded-circle">
                                            <span>Christian</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>950</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>Lvl. 7</span>
                                        </div>
                                    </div>
                                </li>
                                <li class="list-group-item list-group-item-action list-group-item-light">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="col p-0 text-left">
                                            <img src="../img/profile_silvan.png" alt="Profile" class="img-awards-profile rounded-circle">
                                            <span>Silvan</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>900</span>
                                        </div>
                                        <div class="col p-0 text-right">
                                            <span>Lvl. 7</span>
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
  </div>
</template>

<style scoped>
/*--------------------Profile--------------------*/

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


/*--------------------Awards--------------------*/

.img-awards {
    height: 75px;
    width: 75px;
}
</style>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Gamification',
  components: {
     // HelloWorld,
  }
}
</script>
