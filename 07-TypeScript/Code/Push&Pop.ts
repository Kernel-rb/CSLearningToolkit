let ids: number[] = [];
let saif: number = Math.random();


function add_id() {
    let txt: String = "add success";
    let add: any = ids.push(saif)
    return txt && add
};

function del() {
    let txt: String = "pop success";
    let pop: any = ids.pop();
    return txt && pop
};


if (ids.length === 2) {
    del();
   
} else {
    add_id();
}


