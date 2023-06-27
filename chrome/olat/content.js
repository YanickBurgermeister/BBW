


function WriteJson() {
    const json = JSON.stringify(exercisesFetch);
    chrome.storage.local.set({"solutions": json});
}