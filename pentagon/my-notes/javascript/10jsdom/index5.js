<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Pentagon space</h1>
     <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Aperiam at placeat commodi quaerat omnis molestiae iusto eos veritatis in expl</p>
     <h1 id="one">Manasa</h1>
     <h1 id="one">Gond</h1>
    <p id="two">Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis esse itaque enim accusamus nesciunt explicabo alias expedita nulla fugiat laudantium temporibus delectus, dolore porro odit earum, ullam deserunt. Voluptatem, quas?</p>
    <p id="two"> L hsgyfsgdjxbn orem</p>
</body>
<script>
    // doucment.querySelector()
    //querySelector return first elemets in doucmnet that matches specific selector or group of selector
    //if no matches found it will return null values
    let p1ref=document.querySelector('p')
    p1ref.style.backgroundColor='gray'
    p1ref.innerHTML="mnanabshashagsaugsdgswsdwu"
    console.log(p1ref)
    console.log(document.querySelector('h1'))
   let pref= document.querySelector('#two')
   console.log(pref)
   console.log(document.querySelector('#one'))



</script>
</html>