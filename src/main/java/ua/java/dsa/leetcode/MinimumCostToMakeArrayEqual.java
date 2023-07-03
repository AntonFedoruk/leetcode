package ua.java.dsa.leetcode;

public class MinimumCostToMakeArrayEqual {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2};
        int[] nums2 = {2, 2, 2, 2};
        int[] nums3 = {1, 2};
        int[] nums4 = {250842, 634565, 748880, 313974, 774323, 818133, 369967, 493361, 989538, 504687, 687394, 372248, 623829, 509527, 45146, 334673, 658368, 737388, 668868, 577149, 413106, 701756, 656863, 815787, 843493, 528983, 731589, 506233, 998137, 269579, 789182, 525469, 223198, 941679, 58425, 843512, 129475, 834951, 502464, 862843, 619251, 324317, 220324, 625703, 949592, 182503, 433139, 231660, 829133, 373638, 269963, 592861, 853470, 484249, 956645, 603897, 417992, 149068, 857909, 442054, 267812, 588844, 670066, 466369, 7569, 535250, 246711, 231333, 321, 170814, 889531, 294611, 983061, 785393, 28231, 994219, 10418, 401332, 542135, 41390, 107830, 159549, 499309, 332090, 554558, 273956, 356076, 946053, 178789, 922270, 741993, 444140, 784964, 480669, 536549, 550591, 255931, 109235, 962694, 770231, 370187, 374214, 446954, 293323, 832997, 518968, 933802, 598535, 532650, 89435, 964823, 953386, 288542, 224211, 904938, 785381, 867113, 609026, 12703, 79661, 12762, 818290, 550479, 979104, 777422, 968402, 120667, 690991, 357450, 566912, 285810, 816136, 602646, 544692, 111867, 591176, 603899, 776877, 217586, 780869, 183084, 144793, 853169, 50883, 558017, 419124, 152660, 848698, 467071, 913832, 893140, 885917, 799376, 345506, 111091, 382194, 41626, 193009, 510264, 860371, 789052, 361546, 437207, 807109, 777029, 672963, 42097, 110188, 276491, 280187, 97505, 285668, 123523, 569889, 689747, 109962, 851368, 82761, 991316, 763371, 128505, 514107, 476797, 303243, 639221, 530187, 418308, 604323, 840118, 195049, 177744, 450685, 73502, 375899, 138613, 473622, 876591, 297935, 386693, 745483, 450383, 518031, 475272, 871346, 734316, 482857, 37148, 796753, 246052, 785027, 933441, 89949, 962684, 933266, 570599, 494911, 272911, 870238, 623485, 747723, 594128, 831226, 513154, 547797, 237057, 182595, 157241, 112922, 810962, 628148, 153578, 526722, 22826, 577855, 953789, 514659, 350434, 483452, 264040, 98857, 225852, 44327, 656095, 563142, 138282, 399169, 733519, 815497, 512317, 296378, 483977, 191549, 600017, 272018, 756447, 14238, 502297, 146959, 729565, 701820, 912036, 97818, 145065, 900919, 244153, 286172, 771608, 25959, 559204, 965223, 116309, 509924, 39031, 336849, 279009, 897666, 891322, 979897, 92621, 431219, 335683, 759327, 845503, 906192, 228893, 432975, 554111, 37024, 225262, 532228, 155306, 141671, 439089, 15345, 291436, 203828, 932466, 183096, 848831, 901616, 582334, 24132, 123725, 862101, 855685, 927720, 120003, 646583, 526428, 562505, 486995, 597938, 685527, 373795, 634234, 843111, 872082, 158017, 679482, 885704, 651433, 90441, 854531, 581103, 723641, 43981, 685026, 822883, 756421, 500242, 563838, 164100, 790225, 98389, 457658, 564259, 829398, 153190, 580031, 75975, 924740, 587830, 499694, 815390, 139381, 323844, 171231, 808894, 281999, 806205, 42019, 60130, 775610, 780889, 967039, 409790, 800668, 63705, 536814, 475830, 635640, 299317, 82672, 350119, 640976, 852110, 931384, 182740, 667385, 268053, 744635, 750461, 421781, 113500, 95296, 441665, 886870, 515032, 153653, 465554, 962076, 901019, 638628, 638279, 794660, 590638, 354586, 579307, 450798, 412230, 167346, 421240, 178985, 730840, 881255, 736020, 892050, 662102, 857623, 396825, 114628, 217748, 509215, 276823, 440123, 218091, 978045, 640526, 150806, 899720, 209186, 99510, 33531, 456395, 38982, 27064, 681919, 45613, 125368, 661043, 337748, 818708, 48982, 882077, 68519, 853823, 444425, 432036, 957915, 59984, 966087, 966635, 690191, 203608, 751391, 782687, 345699, 692028, 574510, 473660, 69161, 775316, 7317, 604388, 779458, 991191, 728698, 395193, 18781, 659220, 523315, 859492, 355175, 914488, 396535, 343093, 98091, 101775, 921146, 895342, 698053, 951999, 327267, 224035, 311736, 594897, 870906, 193802, 192625, 224514, 646530, 450232, 459763, 752203, 869219, 205817, 182702, 286752, 840924, 678151, 949886, 434349, 321080, 97341, 516415, 962452, 76978, 968331, 572508, 455336, 670061, 510690, 790389, 425049, 59814, 874417, 206208, 99337, 13325, 860469, 932340, 691282, 612249, 320228, 845729, 129685, 418829, 781440, 474829, 966506, 543442, 894115, 539705, 412946, 360789, 855385, 962392, 991341, 425921, 320410, 697516, 508120, 665383, 87560, 837859, 308961, 33877, 916037, 58905, 925608, 511342, 885184, 651665, 737916, 654492, 415482, 892541, 182092, 660845, 478289, 517217, 502480, 857045, 960308, 950645, 861267, 337045, 885247, 183983, 652678, 375665, 89492, 609149, 600655, 153988, 365826, 809915, 692718, 666750, 202680, 937720, 180442, 838858, 310843, 679900, 754834, 323341, 30096, 758422, 121339, 303745, 178469, 377096, 946945, 73710, 642803, 787287, 641570, 443983, 737467, 200455, 135682, 779957, 695910, 195176, 11580, 278158, 113028, 320059, 319789, 399544, 946416, 646319, 447221, 843260, 658200, 783849, 615697, 432449, 439392, 334030, 558202, 438977, 135596, 316500, 276233, 621809, 495010, 387899, 189268, 765476, 836579, 281597, 449733, 416789, 420989, 908327, 4716, 784161, 96111, 310010, 989985, 465125, 783916, 727253, 992463, 985853, 864184, 638210, 88131, 915716, 147775, 468253, 277546, 500930, 404296, 134218, 328694, 306876, 475423, 714625, 50917, 611709, 857291, 869926, 18785, 59523, 45078, 832516, 366177, 806925, 819987, 590326, 866178, 870347, 71713, 729590, 969591, 836043, 147646, 951594, 995411, 422253, 885142, 911639, 923730, 501756, 168779, 357660, 906241, 669823, 779858, 703334, 123950, 712741, 301809, 737739, 213957, 234527, 646017, 176323, 762878, 607053, 958662, 136008, 848404, 58362, 242604, 335877, 866262, 419643, 105358, 799007, 764778, 642376, 487428, 759964, 665452, 615630, 976532, 906671, 477731, 855631, 319532, 212880, 11595, 129195, 152849, 298758, 890332, 185257, 815462, 431071, 14245, 874947, 392436, 186817, 843475, 251140, 942808, 249738, 238980, 463494, 782403, 670157, 777123, 297935, 617838, 323169, 75615, 592039, 420421, 709536, 632368, 544236, 368405, 240110, 244044, 241206, 522922, 581460, 208559, 477389, 807605, 130067, 602571, 317747, 229288, 792984, 104130, 627721, 835942, 568780, 695533, 70075, 813336, 670008, 531923, 137456, 136773, 106378, 460465, 605465, 682905, 154057, 104659, 736024, 993885, 366232, 550361, 50213, 269536, 303301, 541149, 197814, 168098, 793062, 795419, 992498, 858474, 667158, 977360, 43153, 462527, 858929, 254544, 325906, 660859, 330818, 384343, 888190, 476795, 665082, 668192, 665134, 241892, 891198, 741017, 415507, 835850, 398103, 741598, 997445, 858838, 218120, 937283, 146096, 632695, 952548, 580357, 708245, 230056, 195662, 257841, 870198, 547662, 286255, 70046, 291303, 140700, 26210, 40138, 456665, 821347, 578436, 185878, 299, 490945, 777275, 798741, 339949, 516183, 919574, 35200, 579755, 21701, 99806, 290233, 472919, 751085, 739784, 598120, 217124, 23079, 156365, 281975, 378769, 726275, 515658, 289080, 678630, 781322, 454982, 298140, 3354, 551074, 599197, 478085, 890155, 107101, 122077, 336157, 285280, 323209, 884349, 787939, 483218, 614255, 207888, 625518, 354573, 78230, 584980, 754732, 977806, 946989, 952988, 394710, 973876, 65427, 251116, 475717, 702717, 783206, 840246, 633366, 802887, 684816, 729929, 447707, 30378, 745889, 7360, 730311, 201735, 989631, 8936, 44151, 436521};

        int[] cost = {2, 3, 1, 14};
        int[] cost3 = {1, 100};
        int[] cost4 = {282161, 550355, 537498, 541305, 316115, 960425, 985474, 448019, 147246, 944253, 702163, 574071, 419769, 798783, 820989, 170650, 988651, 36052, 978461, 295402, 985122, 471191, 602159, 326496, 132045, 167368, 120310, 75318, 274333, 314856, 200884, 579315, 282148, 690924, 660463, 819603, 359724, 174974, 384805, 954770, 675264, 58560, 511287, 425016, 490488, 870058, 461397, 484867, 33352, 163090, 414536, 114877, 90736, 58207, 362548, 591865, 698303, 788516, 818579, 257473, 9371, 854255, 218224, 43451, 474860, 399130, 692459, 553937, 575187, 258104, 180794, 271016, 20817, 855306, 717838, 894355, 670884, 346992, 886255, 168472, 612347, 937755, 872755, 367757, 662736, 828579, 910272, 163386, 857252, 433621, 85170, 178421, 105561, 706867, 934634, 591008, 45706, 595358, 541450, 186602, 800437, 394776, 511647, 438764, 65391, 383983, 642176, 25327, 733538, 734855, 354523, 898298, 366480, 360524, 397818, 710796, 285864, 538371, 700173, 412229, 149911, 321176, 500705, 167452, 746974, 541729, 110030, 716247, 809825, 240841, 489716, 913453, 223911, 132333, 863167, 121259, 667971, 746795, 820389, 478937, 485902, 490543, 472081, 632504, 220142, 243152, 960783, 945328, 307169, 670909, 475673, 309858, 166955, 214884, 512961, 502571, 502284, 109143, 834524, 555317, 218679, 604298, 589411, 348642, 275375, 824716, 551893, 818610, 580146, 250127, 826865, 450229, 818141, 25048, 952425, 473687, 192517, 106315, 15372, 862723, 258087, 254005, 350061, 59950, 530434, 553928, 153524, 780924, 680057, 333471, 344953, 916465, 306451, 809851, 284056, 360663, 335897, 222279, 69995, 212445, 881305, 310566, 340203, 546433, 880858, 561730, 510976, 54763, 394006, 593209, 16414, 158423, 985443, 400602, 296758, 809084, 185821, 660379, 957054, 775623, 852151, 318353, 157598, 951723, 104191, 900498, 502691, 972546, 300741, 279624, 895898, 24873, 191032, 758687, 943803, 470125, 521136, 847399, 746435, 611069, 640878, 273197, 319989, 868626, 426742, 552701, 319016, 519162, 211155, 185034, 787929, 529282, 952124, 86322, 65603, 322559, 551159, 291388, 795341, 810136, 973364, 714732, 919464, 896689, 58349, 648647, 137626, 408061, 567703, 401232, 92284, 691826, 559270, 988463, 258932, 116557, 584438, 431984, 480755, 932616, 484898, 667761, 704205, 760833, 682162, 497870, 225498, 201065, 897330, 360102, 412816, 541448, 186817, 770725, 596483, 921685, 72254, 479715, 598436, 295769, 470564, 503818, 304165, 694740, 937652, 446140, 930198, 623564, 263683, 364083, 712747, 930103, 498623, 677878, 502329, 978186, 606157, 451391, 268350, 628731, 78469, 336065, 6911, 413645, 796516, 759470, 894312, 169050, 820882, 662871, 550446, 616987, 443502, 448263, 998255, 265830, 986469, 680569, 316387, 793161, 879462, 795561, 228695, 881700, 751223, 977448, 151600, 638060, 22724, 125469, 550946, 507739, 838275, 719988, 804429, 631373, 842956, 995027, 193104, 505814, 732813, 22120, 992360, 459036, 597546, 350505, 452737, 464117, 97638, 73104, 83577, 776169, 188364, 277633, 916207, 140413, 893413, 924473, 448105, 637241, 84652, 104427, 101952, 116514, 312758, 848055, 499099, 890986, 826866, 159987, 603368, 806208, 261818, 219043, 956455, 998966, 102715, 465517, 596410, 117879, 66484, 648963, 944415, 26167, 166810, 501427, 446748, 666153, 476523, 86104, 973558, 581139, 883472, 55230, 417246, 250698, 231421, 604642, 270102, 42960, 30658, 176498, 635369, 139518, 974787, 152598, 291216, 782963, 930352, 356118, 463055, 523437, 514509, 676163, 830020, 317974, 371584, 504684, 726896, 825057, 237257, 930988, 736070, 762146, 282280, 873741, 838894, 472653, 269627, 818897, 978889, 570887, 976847, 982637, 661781, 640673, 431258, 340433, 934835, 549434, 717737, 620816, 921695, 360219, 916459, 979294, 265732, 693036, 644039, 160774, 884629, 171447, 99128, 638, 902625, 648881, 800944, 932073, 322718, 80762, 143474, 934, 378819, 993493, 790652, 906084, 461697, 905791, 255307, 749501, 191640, 593842, 675660, 851036, 328408, 671157, 921022, 151433, 536153, 354362, 690074, 601707, 864843, 718211, 905784, 949744, 990323, 171474, 293375, 33499, 786387, 316056, 627113, 384656, 317170, 982488, 321283, 985993, 681015, 440776, 189622, 918255, 758276, 804856, 95519, 701257, 538707, 165744, 588746, 851903, 748768, 422398, 780393, 887132, 131479, 98510, 92556, 144597, 263080, 636505, 878073, 431573, 595985, 200797, 211542, 394091, 211538, 360590, 453252, 885880, 799557, 732671, 38620, 609679, 571431, 450991, 348718, 981210, 202187, 705536, 62022, 221244, 739454, 460033, 303771, 390413, 780403, 238932, 846602, 847416, 618135, 224810, 140188, 137313, 38193, 134244, 817817, 848916, 309402, 254523, 398606, 707801, 80167, 675632, 962298, 450426, 507832, 914941, 263200, 471108, 219273, 165803, 155061, 747718, 427907, 460094, 482308, 871597, 493334, 384404, 594612, 707493, 7093, 365358, 152139, 380443, 248421, 323883, 586183, 349763, 798843, 338186, 262306, 439746, 724740, 957884, 189153, 40983, 570061, 873988, 589263, 645992, 222994, 370898, 856082, 106031, 202116, 988621, 657175, 951102, 699656, 430617, 344134, 272780, 327244, 617314, 157526, 215236, 341599, 922749, 899459, 3926, 611981, 855206, 839638, 125777, 712471, 142942, 665110, 377750, 607286, 125118, 256639, 602663, 416116, 232380, 177490, 520188, 799488, 368690, 153442, 470687, 890974, 935865, 35570, 860241, 568806, 737827, 363084, 494591, 545006, 309761, 484201, 673007, 189668, 918072, 7718, 679243, 940016, 688499, 640273, 704535, 28830, 758232, 702879, 521728, 806268, 862769, 469597, 751328, 495200, 420028, 522050, 702649, 635859, 307252, 775030, 329315, 992187, 703311, 199059, 12608, 218765, 124849, 584159, 166602, 84942, 286677, 421670, 769904, 796505, 287745, 65899, 694751, 337978, 514005, 328815, 939516, 616271, 730138, 538583, 758832, 462676, 791446, 651612, 625143, 645321, 375811, 639957, 400187, 786344, 538875, 360491, 351563, 18265, 863849, 850500, 306229, 174410, 366020, 110161, 161632, 723058, 697383, 173719, 477991, 884753, 780271, 990135, 276796, 399379, 934945, 566812, 640511, 328602, 954051, 946598, 274727, 987825, 356433, 324910, 463959, 42995, 804076, 272556, 389918, 267485, 749632, 979726, 506521, 304069, 801244, 927445, 101048, 184529, 734949, 274626, 648234, 745178, 198920, 655100, 408645, 769066, 736293, 498517, 715692, 402282, 185317, 110528, 240994, 303647, 251839, 984186, 838941, 454628, 568345, 328427, 968180, 730182, 352409, 197473, 721067, 868147, 545334, 162155, 130740, 568544, 363376, 128376, 781552, 786538, 1573, 125606, 355734, 907225, 604823, 64123, 363193, 332544, 58998, 800953, 222058, 496403, 718203, 263590, 120316, 372907, 72729, 780500, 811287, 388528, 736881, 183377, 77739, 570855, 464048, 446184, 554243, 773815, 804732, 111179, 262404, 286638, 479893, 206588, 132819, 430649, 37349, 110027, 972385, 868722, 1236, 736748, 890785, 674594, 639292, 762105, 91518, 921606, 79452, 849791, 742536, 613698, 322908, 94506, 461962, 482670, 380513, 428426, 749355, 966987, 991337, 142644, 941023, 546858, 393874, 620914, 765701, 231919, 65253, 200629, 804941, 298793, 228817, 263215, 591678, 147160, 849569, 161565, 475050, 404388, 256525, 737183, 965540, 293379, 837695, 242721, 886296, 264171};

        System.out.println(minCost(nums4, cost4));
        System.out.println(minCost2(nums4, cost4));
    }

    public static long minCost(int[] nums, int[] cost) {
        int length = nums.length;
        long min = nums[0], max = nums[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        if (min == max) {
            return 0;
        }

        Long minCostSum = Long.MAX_VALUE;
        for (long i = min; i <= max; i++) {
            long sum = 0;
            for (int j = 0; j < length; j++) {
                sum += Math.abs(i - nums[j]) * cost[j];
            }
            if (sum < minCostSum) {
                minCostSum = sum;
            }
        }
        return minCostSum;
    }

    public static long minCost2(int[] nums, int[] cost) {
        int length = nums.length;
        long min = nums[0], max = nums[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        if (min == max) {
            return 0;
        }
        long minCostSum = Long.MAX_VALUE;

        while (min < max) {
            long middle = (min + max) / 2;
            long costMid = count(nums, cost, middle);
            long costMidRight = count(nums, cost, middle + 1);

            if (costMid > costMidRight) {
                min = middle + 1;
                minCostSum = costMidRight;
            } else {
                max = middle;
                minCostSum = costMid;
            }
        }
        return minCostSum;
    }

    private static long count(int[] nums, int[] cost, long target) {
        long sum = 0L;
        for (int j = 0; j < nums.length; j++) {
            sum += Math.abs(target - nums[j]) * cost[j];
        }
        return sum;
    }
}
