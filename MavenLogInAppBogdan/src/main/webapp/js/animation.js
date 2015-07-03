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
    if (!distance) distance = 250;
    if (!speed) speed = 500;

    //if object.style.marginLeft();
}
