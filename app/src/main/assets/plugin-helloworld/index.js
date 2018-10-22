
module.exports = function(plugin){
    const runtime = plugin.runtime;
    const scope = plugin.topLevelScope;

    function helloworld(){
    }

    helloworld.stringFromJava = plugin.getStringFromJava();

    helloworld.say = function(message){
        plugin.say(context, message);
    }

    return helloworld;
}