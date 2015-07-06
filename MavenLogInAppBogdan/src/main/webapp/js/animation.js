/**
 * Created by SlaSh on 7/3/2015.
 */

function addEvent(object, event, fn, capture) {
    event=event.replace('on', "");
    if (object.attachEvent)
        object.attachEvent('on' + event, fn);
    else {
        if (!capture) capture = false;
        object.addEventListener(event, fn, capture);

    }
}

function moveDiv(object, distance, speed) {
    if (!distance) distance = 250;    // valori implicite
    if (!speed) speed = 500;          // valori implicite

    if (!object.style.marginLeft)
        object.style.marginLeft = 0 + "px";

    var timer = null,
        startTime = ( new Date).getTime(),
        elapsed = null;
        d = null;

    // console.log(startTime); //test
    timer = setInterval(function() {
        elapsed = (new Date).getTime() - startTime;
        //console.log(elapsed); //test

        if (elapsed < speed) { // do the animation
            d = elapsed / speed * distance;
            //console.log(d); // test
            object.style.marginLeft = d + "px";
        } else { // stop the animation
            clearInterval(timer);
        }
        //console.log(elapsed); //yep, another test
    }, 5);

}














