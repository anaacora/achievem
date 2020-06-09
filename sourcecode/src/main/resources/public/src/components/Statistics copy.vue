<template>
  <div class="statistics">
    <div class="row mb-3">
      <div class="col">
        <h3>Statistics</h3>
      </div>
      <div class="col muted d-flex justify-content-end pt-2">
        <div>
          <i class="fas fa-chevron-left hovering mr-1"></i>
          <p class="no-space hovering">
            <span>Weekly</span>
          </p>
          <i class="fas fa-chevron-right hovering ml-1"></i>
          <i class="fas fa-calendar hovering ml-1"></i>
          <i class="fas fa-chevron-down hovering ml-4"></i>
        </div>
      </div>
    </div>
    <div class="row mb-1">
      <div class="col d-flex justify-content-center muted">
        <div>
          <i @click="updateChart()" class="fas fa-chevron-left hovering mr-3"></i>
          <p class="no-space hovering">
            <span>Drink 2l water</span>
          </p>
          <i @click="updateChart()" class="fas fa-chevron-right hovering ml-3"></i>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col d-flex justify-content-center">
        <div>
          <p class="no-space hovering muted">
            <span>Achieved goals in percent</span>
          </p>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col d-flex justify-content-center">
        <!--<img src="./img/statistic.png" alt="Statistics" class="statistic m-2 mt-4">
        <canvas id="statisticChart" class="statistic"></canvas>-->

        <line-chart
      v-if="loaded"
      :chartdata="chartdata"
      :options="options"/>
      </div>
    </div>
  </div>
</template>

<script>
import LineChart from './Chart.vue'

export default {
  name: 'LineChartContainer',
  components: { LineChart },
  data() {
    return {
      datacollection: {
        labels: ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
        datasets: [
          {
            label: "# of Episodes",
            yAxisID: "A",
            data: [75, 150, 80, 120, 70, 100, 20],
            backgroundColor: "rgba(130, 183, 227, 1)",
            borderColor: "rgba(46, 136, 209, 1)",
            borderWidth: 1
          }
        ]
      },
      options: {
        tooltips: { enabled: false },
        legend: {
          display: false
        },
        responsive: false,
        scales: {
          yAxes: [
            {
              id: "A",
              ticks: {
                stepSize: 50,
                beginAtZero: true
              }
            }
          ]
        }
      }
    };
  },
  async mounted() {
    this.renderChart(this.datacollection, this.options);
  },
  methods: {
    updateChart() {
      alert("yoo");
      //get new data as param probably

      // add label
      //statisticChart.data.labels.push(name);
      // add nr of episodes
      //statisticChart.data.datasets[0].data.push(nrOfEpisodes);

      //add colorcodes as attribute to categories in DB -> easier
      var categories = ["blue", "purple", "orange", "green"];
      var category = categories[1];

      //COLORS USED: always 50 % & 70 %

      if (category === "blue") {
        //IF Blue - Health & Food:
        this.datacollection.datasets[0].borderColor = "rgba(46, 136, 209, 1)";
        this.datacollection.datasets[0].backgroundColor =
          "rgba(130, 183, 227, 1)";
      } else if (category === "purple") {
        //IF Purple - Education:
        this.datacollection.datasets[0].borderColor = "rgba(173, 82, 132, 1)";
        this.datacollection.datasets[0].backgroundColor =
          "rgba(206, 151, 181, 1)";
      } else if (category === "orange") {
        //IF Orange - Sports:
        this.datacollection.datasets[0].borderColor = "rgba(209, 112, 46, 1)";
        this.datacollection.datasets[0].backgroundColor =
          "rgba(227, 169, 130, 1)";
      } else if (category === "green") {
        //IF Green - Lifestyle:
        this.datacollection.datasets[0].borderColor = "rgba(71, 184, 116, 1)";
        this.datacollection.datasets[0].backgroundColor =
          "rgba(145, 212, 172, 1)";
      }

      // update the chart
      this.renderChart(this.datacollection, this.options);
    }
  }
};

/*import { Bar } from 'vue-chartjs'
var ctx = document.getElementById("statisticChart");
var statisticChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
        datasets: [{
            label: '# of Episodes',
            yAxisID: 'A',
            data: [75, 150, 80, 120, 70, 100, 20],
            backgroundColor: 'rgba(130, 183, 227, 1)',
            borderColor: 'rgba(46, 136, 209, 1)',
            borderWidth: 1
        }]
    },
    options: {
        tooltips: { enabled: false },
        legend: {
            display: false
        },
        responsive: false,
        scales: {
            yAxes: [{
                id: 'A',
                ticks: {
                    stepSize: 50,
                    beginAtZero: true
                }
            }]
        }
    }
});

//call initChart when page gets called
function initChart() {
    //calculate time and set labels 
    //statisticChart.data.labels = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

    //set data to first activ goal
}

//updates the chart
function updateChart(data) {

    //get new data as param probably

    // add label
    //statisticChart.data.labels.push(name);
    // add nr of episodes
    //statisticChart.data.datasets[0].data.push(nrOfEpisodes);

    //add colorcodes as attribute to categories in DB -> easier
    var categories = ["blue", "purple", "orange", "green"];
    var category = categories[0];

    //COLORS USED: always 50 % & 70 %

    if (category === "blue") {
        //IF Blue - Health & Food: 
        statisticChart.data.datasets[0].borderColor = 'rgba(46, 136, 209, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(130, 183, 227, 1)';
    } else if (category === "purple") {
        //IF Purple - Education: 
        statisticChart.data.datasets[0].borderColor = 'rgba(173, 82, 132, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(206, 151, 181, 1)';
    } else if (category === "orange") {
        //IF Orange - Sports: 
        statisticChart.data.datasets[0].borderColor = 'rgba(209, 112, 46, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(227, 169, 130, 1)';
    } else if (category === "green") {
        //IF Green - Lifestyle: 
        statisticChart.data.datasets[0].borderColor = 'rgba(71, 184, 116, 1)';
        statisticChart.data.datasets[0].backgroundColor = 'rgba(145, 212, 172, 1)';
    }

    // update the chart
    statisticChart.update();
}*/
</script>

<style scoped>
</style>

