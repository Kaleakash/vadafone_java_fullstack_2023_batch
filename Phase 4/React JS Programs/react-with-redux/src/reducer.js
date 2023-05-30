let initialState = {                // initialState hold one variable as counter with value as 10
    counter :100,
    name:"Akash"            // global variable 
}


function reducer(state = initialState,action){
        // base upon action we can do some changes on initialState with counter variable. 
        return state;
}


export default reducer;