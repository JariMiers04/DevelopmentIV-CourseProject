'strict mode'

const pipe = (...fns) => (x) => fns.reduce((v, f) => f(v), x);

const binarySearch = (array,value) => {
    let startIndex = 0;
    let endIndex = array.length -1;
    let middle = Math.floor((endIndex +startIndex)/2);
    while(array[middle] !== value && startIndex < endIndex) {
      if(value < array[middle]){
        endIndex = middle -1;
      }
      else if(value > array[middle]){
        startIndex = middle+1;
      }
      middle =  Math.floor((endIndex + startIndex) /2);
    }
    return (array[middle] != value) ? -1 : middle;
}

const availableItems = ["pudding", "jam", "pizza", "potatoes", "cornflakes", "chocolate"]
const availableItemsSorted = availableItems.sort()

const visitShop = string => string = `Enter the shop.\n`
const browseItems = string => string += `Look at items available.\n`
const addItem = chosenItem => {
    return function getItem(string) {
        // side effect: binarySearch valt buiten de scope
        const foundItem = binarySearch(availableItemsSorted, chosenItem)
        return foundItem != -1 ? string += `Add ${chosenItem}.\n` : string += `${chosenItem} not available. \n`
    }
}
const removeItem = chosenItem => {
    return function getItem(string) {
        // side effect: binarySearch valt buiten de scope
        const foundItem = binarySearch(availableItemsSorted, chosenItem)
        return foundItem != -1 ? string += `remove ${chosenItem}.\n` : string += `${chosenItem} not available. \n`
    }
}
const buyAddedItems = string => string += `Buy all the added items.\n`
const leaveShop = string => string += `Leave the shop.\n`

const regularShopper = pipe(visitShop, browseItems, addItem("jam"), removeItem("jam"), addItem("pancake"), buyAddedItems, leaveShop)
const windowShopper = pipe(visitShop, browseItems, leaveShop)

console.log(regularShopper())
console.log(windowShopper())