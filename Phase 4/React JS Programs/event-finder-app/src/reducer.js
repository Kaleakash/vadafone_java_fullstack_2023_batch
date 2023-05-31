const intialState ={
    events:[]                       // empty event present
}

function reducer(state=intialState,action){
    // we will write code to get the events
    console.log(action)
    switch(action.type){
        case "LOAD_EVENTS":
            return {...state,events:action.payload}
    }
    return state;
}

export default reducer;