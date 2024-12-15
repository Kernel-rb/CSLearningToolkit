import { useState } from "react";

const Example = () => {
    // const [randomNumber, setRandomNumber] = useState(() => {
    //     return Math.round(Math.random() * 10);
    // });

    // const [randomNumbersSet, setRandomNumbersSet] = useState(new Set());
    // const [dupl, setDupl] = useState(false);

    // const generateNewRandomNumber = () => {
    //     const newRandomNumber = Math.round(Math.random() * 10);

    //     setRandomNumbersSet((prevSet) => {
    //         const newSet = new Set(prevSet); 
    //         if (newSet.has(newRandomNumber)) {
    //             setDupl(true); 
    //         } else {
    //             setDupl(false); 
    //             newSet.add(newRandomNumber); 
    //         }
    //         return newSet; 
    //     });

    //     setRandomNumber(newRandomNumber);
    // };   


    // const [lastSeen , SetLastSeen ] = useState(new Date().getTime());
    // const seen = () => {SetLastSeen(new Date().getTime())}
    return (
        <div>
            {/* <h1>Random Number: {randomNumber}</h1>
            <button onClick={generateNewRandomNumber}>Generate Random Number</button>
            {dupl && (
                <div style={{ color: "red", marginTop: "20px" }}>
                    <h3>The number {randomNumber} is a duplicate!</h3>
                </div>
            )} */}
            {/* <h1> last time online  : {lastSeen}  </h1>
            <button onClick={seen}>Seen</button> */}
        </div>
    );
};

export default Example;
