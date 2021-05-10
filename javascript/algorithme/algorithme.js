"use strict";

import testData from "./testData.js";

console.log(testData);
let randomIndex = null;

const binarySearch = (array,value) => {
    let steps= 0;
    let startIndex = 0;
    let endIndex = array.length -1;
    let middle = Math.floor((endIndex +startIndex)/2);
    while(array[middle] !== value && startIndex <endIndex) {
      steps++;
      if(value< array[middle]){
        endIndex = middle -1;
      }
      else if(value> array[middle]){
        startIndex = middle+1;
      }
  
      middle =  Math.floor((endIndex + startIndex) /2);
    }
  
    return (array[middle] != value) ? -1 : middle;
}


const onClickBinarySearch = () =>{
    console.log("binary clicked");
    let start = performance.now();

    // ADD CONTENT
    const steps = binarySearch(testData, testData[randomIndex]);

    let end = performance.now();
    let time = end - start;

    // content
    updateHtml("binary-search", testData[randomIndex], steps, time);
};

const updateHtml = (id, result, steps, time) => {
    console.log('update');
    const container = document.getElementById(id);
    container.getElementsByClassName('guess')[0].innerHTML = result;
    container.getElementsByClassName('statistics')[0].innerHTML = `<h2>Steps: ${steps}</h2><h2>Time: ${time}ms</h2>`;
  };


const init = () => {
    randomIndex = Math.floor(Math.random() * testData.length);
    document.getElementById('random').innerHTML = testData[randomIndex];
    
    document.getElementById('click-binary-search').addEventListener('click', onClickBinarySearch);
}

init();