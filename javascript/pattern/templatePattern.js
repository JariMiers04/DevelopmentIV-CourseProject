'strict mode'

const pipe = (...fns) => (x) => fns.reduce((v, f) => f(v), x);

const visitShop = string => string = `Enter the shop.\n`
const browseItems = string => string += `Look at items available.\n`
const addItem = string => string += `Add an item.\n`
const removeItem = string => string += `Remove an item.\n`
const buyAddedItems = string => string += `Buy all the added items.\n`
const leaveShop = string => string += `Leave the shop.\n`

const regularShopper = pipe(visitShop, browseItems, addItem, removeItem, buyAddedItems,leaveShop)
const windowShopper = pipe(visitShop, browseItems, leaveShop)

console.log(regularShopper())
console.log(windowShopper())