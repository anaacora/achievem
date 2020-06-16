<template>
  <div class="statistics">
    <div class="row">
      <div class="col">
        <h3>Statistics</h3>
      </div>
      <div class="col d-flex muted justify-content-end">
        <div>
          <i class="fas fa-chevron-left hovering"></i>
          <span class="no-space hovering ml-2 mr-1">Weekly</span>
          <i class="fas fa-chevron-right hovering ml-1"></i>
          <i class="fas fa-calendar hovering ml-2"></i>
          <i class="fas fa-chevron-down hovering ml-3"></i>
        </div>
      </div>
    </div>
    <div class="row mb-1">
      <div class="col d-flex justify-content-center muted">
        <i @click="previousChart()" class="fas fa-chevron-left hovering mr-3 mt-1"></i>
        <span class="no-space hovering">{{goals[currentId].title}}</span>
        <i @click="nextChart()" class="fas fa-chevron-right hovering ml-3 mt-1"></i>
      </div>
    </div>

    <div class="row">
      <div class="col d-flex justify-content-center">
        <bar-chart :chart-data="chartdata" :options="options" />
      </div>
    </div>
  </div>
</template>

<script>
import BarChart from "../assets/barchart.js";

export default {
  props: ["goals"],
  components: {
    BarChart
  },
  data: () => ({
    chartdata: {},
    options: {
      title: {
        display: true,
        text: "Achieved goals in percent"
      },
      legend: {
        display: false
      },
      scales: {
        yAxes: [
          {
            ticks: {
              max: 100,
              min: 0,
              stepSize: 10
            }
          }
        ]
      }
    },
    currentId: 0
  }),
  mounted() {
    this.updateChart();
  },
  methods: {
    updateChart() {
      //COLORS USED: always 50 % & 70 %
      var bgc = "";
      if (this.goals[this.currentId].color === "blue") {
        //IF Blue - Health & Food:
        bgc = "rgba(130, 183, 227, 1)";
      } else if (this.goals[this.currentId].color === "purple") {
        //IF Purple - Education:
        bgc = "rgba(206, 151, 181, 1)";
      } else if (this.goals[this.currentId].color === "orange") {
        //IF Orange - Sports:
        bgc = "rgba(227, 169, 130, 1)";
      } else if (this.goals[this.currentId].color === "green") {
        //IF Green - Lifestyle:
        bgc = "rgba(145, 212, 172, 1)";
      }
      this.chartdata = {
        labels: ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
        datasets: [
          {
            backgroundColor: bgc,
            data: this.goals[this.currentId].progressData
          }
        ]
      };
    },
    previousChart() {
      if (this.currentId === 0) {
        this.currentId = this.goals.length - 1;
      } else {
        this.currentId--;
      }
      this.updateChart();
    },
    nextChart() {
      if (this.currentId >= this.goals.length - 1) {
        this.currentId = 0;
      } else {
        this.currentId++;
      }
      this.updateChart();
    }
  }
};
</script>