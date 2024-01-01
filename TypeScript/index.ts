type info = {
    name: string,
    info: string,
    repo: string,
}

function getRepoInfo(repo: string): info {
    return {
        name: "TypeScript",
        info: "Soon",
        repo: "WebMasterToolKit/TypeScript",
    }
}

console.log(getRepoInfo("TypeScript"));