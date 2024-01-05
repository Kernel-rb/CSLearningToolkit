type UserInfo = {
    ID: number;
    UserName: string;
    Age?: number;
    email: string;
    adress: string;
    VerfiedAccount: boolean;
};

function cheacker(user: UserInfo) {
    console.log(
        `
        Your Information :
        ID  =>${user.ID} 
        UserName  =>${user.UserName} 
        Age  => ${user.Age}
        email  =>${user.email} 
        adress  =>${user.adress} 
        VerefiedAccount  => ${user.VerfiedAccount} 
        `
    ) 
};

const UserOne: UserInfo = {
    ID: 1,
    UserName: "saif matab",
    email: "saif@gmail.com",
    adress: "44 rue ...",
    VerfiedAccount: true,
};

const res: any = cheacker(UserOne);

console.log(res)



