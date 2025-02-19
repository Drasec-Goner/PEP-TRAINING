const drums = document.querySelectorAll('.drum');

const sounds = {
    w: 'sounds/crash.mp3',
    a: 'sounds/kick-bass.mp3',
    s: 'sounds/snare.mp3',
    d: 'sounds/tom-1.mp3',
    j: 'sounds/tom-2.mp3',
    k: 'sounds/tom-3.mp3',
    l: 'sounds/tom-4.mp3'
};

function playSound(key) {
    if(sounds[key]) {
        const audio = new Audio(sounds[key]);
        audio.play();
    }
}

function animateButton(key) {
    const button = document.querySelector(`[data-key="${key}"]`);
    if(button) {
        button.classList.add('pressed');
        setTimeout(() => {button.classList.remove('pressed')}, 100);
    }
}

drums.forEach(drum => {
    drum.addEventListener('click', function() {
        const key = this.dataset.key;
        playSound(key);
        animateButton(key);
    });
});

document.addEventListener('keydown', function(event) {
    const key = event.key;
    playSound(key);
    animateButton(key);
});