#!/usr/bin/env node


const a = `
                                       .......................
                                       .......::::::::::......
                                       .......--::::::::::....
                                       .......---::::::::::........
                                       .......----::::::::-:.......
                                       .......-----:::::::--:......
                                       .......-----:::::-----......
                                       ......:-----::::------.......
                                       ......:------:--------.......
                                       ......---------------=.......
                                       .....:-------------==:........
                                       ....:::::---------===.........
                                       ....:::::::------===:.........
                                       ...::::::::-----===:.....
                                   ......::::::::------==:......
                                   .....:::::::::-----==-....
                               ........::::::::::-----=-:.......   ....   ....
                               .......:::::::::::-----=-........   ....   ....
                               ......::::::::::::-----=-..........................
                               .....:::::::::::::::----:...........................
                          .........:::::::::::::::::::::.....................................
                          ........::::::::::::::::::::::::::::::::::::::::::::::::::.........
                          ......:::::::::::::::::::::::::::::::::::::::::::::::::::::::......
                          .....:::::::::::::::::::::::::::::::::::::::::::::::::::::---:.....
          ...................:::::::::::::::::::::::::::::::::::::::::::::::::::--------.....
          ..................:::::::::::::::::::::::::::::::::::::::::::::::::::-----===-.....
       ....................::::::::::::::::::::::::::::::::::::::::::::::::::----======:.......
       ......:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::----======:........
       ......::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-=++=:........
       ......::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::---........
       .....:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-----......
       .....:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::------.....
       .....::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::------=:....
       .....:-::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::--------===:....
       .....:---::::::::::::::::::::::::::::::::::::::::::::::::::::::-----------======......
       .....:------::::::::::::::::::::::::::::::::::::::::::::::---------------======:......
       .....-----------::::::::::::-::::::::::::::::::::::::----:--------------=====:......
       .....--------------------------------------------------------------------=-........
       .....---------------------------------------------------------------------=-......
       .....-=--------------------------------------------------------------------=-....
       .....-=-------------------------------------------------------------------===.....
       .....-==-----------------------------------------------------------------====.....
       .....-===---------------------------------------------------------------====-....
       .....-=========-------------------------------------------------------=====-.....
       .....-==============----------------------------------------------========:......
       .....-=======================----------------------------------=========.........
       .....-===============================---------------------------========....
       .....:=====================================-------------------==========:...
       ......==================================================================....
       ........................:-=============================================:....
          .........................:-=======================================-....
                               ........:-==++========================+===-:......
                               .............:---==================---:.........
                               ..................................................
	`;

console.log(a);

const args = process.argv.slice(2);
var b = Math.floor(Math.random()*args.length);

console.log("발표자: "+args[b]);
