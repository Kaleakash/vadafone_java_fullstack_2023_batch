let initialState = {                // initialState hold one variable as counter with value as 10
    counter :100,
    name:"Akash"            // global variable 
}


function reducer(state = initialState,action){
        // base upon action we can do some changes on initialState with counter variable. 
       console.log(action);
       switch(action.type){
        case "INCREMENT":
            //1st intial state, 2nd which property 
            //3rd parameter value.
            return {...state,counter:state.counter+1}
        case "DECREMENT":
            return {...state,counter:state.counter-1}
       }
        return state;
}


export default reducer;