const pipe = (...fns) => (x) => fns.reduce((v, f) => f(v), x);

const visitShop = () => string = `Enter the shop.`
const browseItems = string => string += `Look at items available.`
const addItem = string => string += `Add an item.`
const removeItem = string => string += `Remove an item.`
const buyAddedItems = string => string += `Buy all the added items.`
const leaveShop = string => string += `Leave the shop.`

const regularShopper = pipe(visitShop, browseItems, addItem, removeItem, buyAddedItems,leaveShop)
const windowShopper = pipe(visitShop, browseItems, leaveShop)

console.log(regularShopper())
console.log(windowShopper())