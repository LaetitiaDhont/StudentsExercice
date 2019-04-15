package com.fr.formation.students.enumeration;

public class StringApplication {
    public static void main(String[] args) {
        String[] words = LOREM.split(" ");
        concat(words);
        stringBuilder(words);
    }

    private static void stringBuilder(String[] words) {
        long start = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word);
            result.append(" ");
        }

        long end = System.currentTimeMillis();

        System.out.println("concat took" + (end - start) + "ms");

    }

    private static void concat(String[] words) {
        long start = System.currentTimeMillis();
        String result = null;
        for (String word : words) {
            result += word + " ";
        }

        long end = System.currentTimeMillis();

        System.out.println("concat took" + (end - start) + "ms");
    }

    private final static String LOREM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec condimentum mauris. Morbi bibendum, ante sollicitudin iaculis congue, nisi ex venenatis augue, eget mollis neque augue sed justo. Fusce nec pretium ligula, ut consequat tortor. Morbi odio est, eleifend id tristique in, lacinia in nunc. Sed fermentum erat dictum metus mattis maximus. Vestibulum et egestas ex. Curabitur luctus cursus pretium. Donec tristique quis metus quis pharetra.\n" +
            "\n" +
            "Etiam vestibulum felis sem, a varius nisl tristique id. Donec turpis arcu, varius non lectus tincidunt, aliquet laoreet leo. Sed varius, sem ac vestibulum blandit, risus urna facilisis ipsum, sed tincidunt nunc mi quis enim. Maecenas egestas nulla mi, et convallis lectus laoreet non. Vestibulum aliquet, lacus dictum ullamcorper porttitor, augue magna facilisis massa, et tempus elit ipsum in justo. Cras porttitor at risus euismod congue. Donec ut lectus ac velit placerat vehicula. Donec ac auctor mauris. Pellentesque ac ipsum suscipit dolor auctor pellentesque. Aenean rhoncus, leo iaculis malesuada vulputate, augue libero dignissim sem, sed lobortis lacus diam mattis justo. Suspendisse gravida id quam vitae venenatis. Morbi quis convallis dolor. Phasellus efficitur sagittis est. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\n" +
            "\n" +
            "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Vestibulum ornare porttitor mauris, ac vulputate dolor laoreet ut. Praesent vitae sollicitudin nibh. Nam id justo at mauris elementum molestie nec eget nibh. Fusce eu iaculis augue, ut aliquam erat. Proin condimentum iaculis nunc non vestibulum. Curabitur venenatis diam quis turpis scelerisque, eget suscipit ex volutpat. Quisque maximus sem diam, vitae tincidunt orci consectetur vel. Pellentesque euismod erat vel nisi molestie, non viverra lacus elementum. Praesent rutrum scelerisque neque id viverra. Fusce non risus at felis volutpat vestibulum at ut orci. Maecenas sit amet diam sit amet leo sodales placerat. Proin sit amet viverra dolor, sit amet bibendum ex. Nullam sit amet egestas orci, sit amet vestibulum nulla. Morbi maximus auctor tellus ac porttitor. Pellentesque non ligula nec odio ultricies eleifend.\n" +
            "\n" +
            "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Vestibulum nisl nunc, gravida ut interdum eget, scelerisque sit amet justo. Quisque dapibus ultricies dolor. Aliquam sapien lorem, condimentum sit amet ullamcorper ut, ornare quis nunc. Aenean sagittis justo vitae facilisis tempor. Etiam ac gravida dui. Proin sed metus ac augue condimentum iaculis dignissim sit amet mi. Fusce aliquam orci quis tortor faucibus, at porta magna laoreet. Morbi bibendum a ante id mollis. Cras facilisis consequat elit accumsan posuere. Sed elementum molestie arcu, ut gravida est fringilla sit amet. Ut vulputate massa ut nisi aliquet, at gravida justo faucibus.\n" +
            "\n" +
            "Fusce id neque viverra, iaculis lacus in, lobortis odio. Praesent commodo accumsan est, a eleifend magna cursus quis. Etiam convallis at augue in aliquam. Vestibulum ac dapibus massa. Vestibulum cursus augue sit amet tortor tincidunt dictum. Quisque accumsan ullamcorper risus. Quisque a pretium quam. Mauris quis velit vel ligula euismod luctus. Praesent id eleifend mauris, at porttitor erat. Etiam id cursus leo. Fusce eu ligula faucibus, lobortis augue a, cursus massa. Nam augue ipsum, porta et urna vitae, finibus sagittis nisl.\n" +
            "\n" +
            "Curabitur pellentesque nisl eget lectus auctor dapibus. Ut luctus dui sed mollis hendrerit. Vestibulum quis tellus quam. Quisque justo urna, laoreet vel condimentum et, vestibulum sed leo. Integer fermentum in enim ac dignissim. Ut vitae consequat neque. Vestibulum et dui non mauris maximus luctus. Proin ac dui eu ligula hendrerit porttitor. Cras eros risus, euismod eget egestas sed, fermentum at urna. Sed egestas, nibh at efficitur efficitur, sapien mi porta risus, ut pharetra est lacus non arcu.\n" +
            "\n" +
            "In rutrum lacus metus, sit amet varius tellus rutrum a. Morbi lacinia vel mi varius tempus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam gravida libero ut volutpat volutpat. Donec vel pharetra dui. Sed eleifend scelerisque mi nec imperdiet. Pellentesque id lectus euismod, interdum felis vel, tristique quam. Pellentesque quis fermentum nunc. Nulla libero justo, blandit eu imperdiet id, accumsan ac neque.\n" +
            "\n" +
            "Vivamus sollicitudin ullamcorper tincidunt. Etiam feugiat nunc tempor odio accumsan, at sodales velit viverra. Suspendisse fringilla massa eu ipsum interdum, facilisis luctus quam condimentum. Nulla elementum orci imperdiet diam vestibulum, in ullamcorper metus sagittis. Nam finibus velit vel nibh porttitor, at facilisis sem sodales. Nullam mattis nibh libero. Nam laoreet ut dui sit amet bibendum.\n" +
            "\n" +
            "Nam risus elit, sodales a interdum ultrices, vestibulum non sapien. Proin diam elit, ornare in lorem in, feugiat malesuada metus. Sed ut arcu lacus. Duis eleifend pretium urna, ac sollicitudin dui. Nulla sagittis quam at libero faucibus, ut fringilla justo viverra. Ut commodo leo eu urna vehicula varius. In scelerisque aliquet nisl, a vehicula nunc euismod ultricies. Vivamus in dictum sapien. Duis eget convallis dolor, eget cursus dui. Fusce bibendum orci nec quam tristique, vel posuere justo ultrices.\n" +
            "\n" +
            "Pellentesque vulputate at dolor a luctus. Sed diam nunc, facilisis id neque nec, mattis ullamcorper urna. In eleifend volutpat fringilla. In hac habitasse platea dictumst. Sed mauris ipsum, tempor ac diam non, rhoncus tempor enim. Sed in finibus nibh, sit amet dapibus neque. Nam eget fringilla urna. Pellentesque id lectus porttitor, congue est ut, pretium felis. Phasellus non ex non odio mattis laoreet eget non mauris. Nulla ut lacus at quam eleifend porttitor. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam malesuada fermentum magna vitae lacinia.\n" +
            "\n" +
            "Etiam et interdum libero, a tincidunt tortor. Aliquam auctor lacinia ex at condimentum. Maecenas quis hendrerit ligula, eu sollicitudin mauris. Praesent vitae elementum nunc, vel scelerisque justo. Morbi ultrices venenatis libero non condimentum. Donec consectetur, erat vel semper lobortis, sem lectus blandit turpis, et scelerisque neque dui vitae quam. In lorem turpis, aliquet eu quam eget, congue porta elit. Curabitur vehicula convallis scelerisque. Cras vitae semper ipsum. Donec maximus risus id felis maximus vulputate. Mauris pellentesque lorem sit amet nunc gravida, vel feugiat velit varius. Maecenas consectetur et metus sed semper. Praesent ultricies auctor nisl, eu euismod lorem aliquet non. Nullam at consequat nisi.\n" +
            "\n" +
            "Donec tincidunt justo elementum congue elementum. Nullam in magna quis erat tincidunt tempor. Etiam lacinia sem eget sem vestibulum luctus a ut arcu. Sed dapibus purus ut risus aliquet, nec interdum turpis laoreet. Aliquam volutpat tortor nec semper eleifend. In quis lectus tellus. Donec vulputate eros non fringilla fermentum. Pellentesque lacinia risus nec imperdiet ullamcorper. Nam condimentum maximus dui, vitae mattis metus scelerisque malesuada. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris id imperdiet mauris, quis venenatis felis.\n" +
            "\n" +
            "Nulla tincidunt commodo sapien, ac imperdiet turpis consectetur at. Fusce urna elit, accumsan vulputate gravida vitae, fringilla sed sem. Nulla fringilla erat vitae arcu tincidunt, non mattis tortor ultrices. Mauris at leo id velit porta venenatis at sit amet erat. Proin sed volutpat turpis. Proin a imperdiet felis. Mauris nec arcu risus. Integer blandit dapibus nulla eu tincidunt.\n" +
            "\n" +
            "Suspendisse vitae felis non turpis convallis maximus. Praesent ac lectus mollis, placerat tortor cursus, eleifend erat. Integer ultrices, leo nec pharetra maximus, sapien nulla sagittis neque, tincidunt lacinia ante leo vitae lorem. Donec ullamcorper tempus ligula ut hendrerit. Curabitur ex libero, viverra ac nibh ut, dignissim tempus nisi. Fusce condimentum, nibh ac tempor dictum, sapien dolor commodo turpis, quis convallis dui ligula sed neque. Etiam efficitur velit vel purus mollis, id dignissim libero dignissim. Vestibulum felis tellus, mollis ut finibus quis, finibus sit amet turpis. Suspendisse volutpat sagittis velit.\n" +
            "\n" +
            "Etiam in sagittis nunc. Etiam tempus leo nec magna tristique, non consequat elit suscipit. Donec nec purus et nunc tincidunt congue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Praesent id nibh sed purus pellentesque lacinia ut id lectus. Aenean vitae nisl quis justo iaculis cursus iaculis at odio. Aenean ut sapien varius, hendrerit augue vel, efficitur nunc. Integer egestas facilisis magna, vel fermentum purus vestibulum sollicitudin. Phasellus faucibus sed nibh id semper. Cras at purus arcu. Cras efficitur enim a felis euismod, sed porttitor elit pharetra. Integer eu ornare enim. Integer vitae nulla tincidunt, imperdiet elit vel, eleifend ipsum. Integer vitae eleifend velit, in tincidunt ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris lacus ipsum, tincidunt et sapien luctus, tempor tempor nisi.\n" +
            "\n" +
            "Phasellus pretium a quam at malesuada. Proin et semper dui, at molestie urna. Nam et egestas sapien. Proin sed malesuada sem. Curabitur in sapien eget arcu gravida eleifend lobortis id nunc. Sed ut molestie elit. Maecenas non nisl vitae diam rhoncus vulputate. Etiam accumsan magna eget aliquet consectetur. Nunc sed placerat libero, a pharetra nisi. Proin vitae turpis dictum, faucibus urna eget, ornare justo. Curabitur rhoncus semper purus a semper. Cras rutrum, neque at suscipit pulvinar, nisi nisi pulvinar turpis, non convallis eros eros interdum felis. In odio purus, ullamcorper non eros sit amet, finibus dictum orci. In hac habitasse platea dictumst.\n" +
            "\n" +
            "Vivamus sit amet tincidunt leo, ut aliquet nisl. Pellentesque placerat porta consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc dictum purus nulla, rutrum commodo est tincidunt eget. Aliquam tincidunt libero lobortis varius facilisis. Morbi massa sapien, accumsan vel ultrices a, interdum et nisl. Donec nec consequat arcu. Sed aliquet venenatis lacus, quis convallis nibh tristique lacinia. Aliquam erat volutpat. Cras aliquam fermentum vulputate.\n" +
            "\n" +
            "Nunc viverra, ante eu scelerisque molestie, ligula lorem consequat neque, non egestas massa felis vel odio. Suspendisse et libero est. Maecenas justo leo, gravida eget bibendum tristique, dignissim in libero. Sed eleifend posuere ex a viverra. Nam sit amet neque tincidunt, feugiat lacus in, ornare ipsum. Vivamus mollis nec arcu non placerat. Mauris pretium dapibus diam ac interdum. Suspendisse augue mi, iaculis et purus in, suscipit eleifend lorem. Curabitur convallis, urna ut interdum sollicitudin, magna velit efficitur lacus, a accumsan leo ipsum eget sem. In sit amet lacus nunc. Quisque vulputate felis et risus posuere rutrum. Fusce pulvinar leo sit amet ante tincidunt convallis. Duis ullamcorper nibh sed pellentesque finibus. Etiam dictum tincidunt eros, eget luctus lacus pulvinar nec. Donec vel aliquam velit.\n" +
            "\n" +
            "Phasellus at ex lobortis, egestas magna ut, luctus sem. Vestibulum aliquet augue in efficitur porttitor. Mauris molestie pharetra sem. Nam posuere magna sed est sodales vehicula. Nam turpis lacus, tempus at tortor sed, interdum commodo turpis. Aenean sapien orci, ullamcorper vel ex ac, tincidunt viverra orci. Donec ac posuere justo. Vivamus ac tempus quam, quis semper odio. Donec at justo vel tortor congue iaculis. Vestibulum posuere a ex a tristique.\n" +
            "\n" +
            "Duis at euismod mauris. Suspendisse posuere aliquet sapien sit amet tristique. Fusce euismod vulputate aliquam. Nunc faucibus tellus vitae feugiat venenatis. Curabitur tincidunt ante ac lectus rutrum placerat. Donec in neque nunc. Nullam pretium dui vel urna fermentum eleifend sit amet convallis mi. Morbi semper, eros eget ultrices porttitor, purus magna interdum arcu, ac commodo dui magna ut velit. Nulla tempus urna orci, a dignissim eros volutpat sed. Vestibulum finibus congue dolor, a fermentum dui. Quisque erat diam, rhoncus mattis mi vel, tincidunt elementum tortor. Nullam dolor erat, cursus sed leo nec, elementum convallis justo. Aenean viverra suscipit est, ac luctus risus placerat et. Donec quis feugiat tortor. Nullam ultricies facilisis metus nec convallis.\n" +
            "\n" +
            "Sed sodales hendrerit risus a viverra. Ut quis massa vitae metus sagittis venenatis id ut velit. Proin ac porta nisl, quis molestie felis. Vestibulum metus lacus, pulvinar eget tincidunt at, pharetra quis sem. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras ornare et velit quis pellentesque. Duis lobortis augue at gravida efficitur. Praesent vitae placerat ipsum, quis sollicitudin nunc. Sed tristique ligula metus, at porta sem suscipit in. Etiam ultricies lorem eu mollis cursus. Aenean tortor lorem, egestas id diam quis, volutpat rutrum mauris.\n" +
            "\n" +
            "Fusce posuere elit odio, vel accumsan lacus mollis a. Duis condimentum pretium sagittis. Nam quis lacinia velit. Donec ultricies accumsan accumsan. Mauris convallis tempus malesuada. Ut tincidunt, lorem ac consequat scelerisque, nisl felis porttitor justo, nec efficitur nisi libero ac nisl. Curabitur maximus lorem nec augue dapibus, at maximus eros lacinia. Fusce id arcu sapien. Sed consectetur congue consectetur. Suspendisse placerat ligula at purus sollicitudin accumsan. Fusce consequat lectus non tortor malesuada sodales. Praesent lacinia ligula eu purus euismod, ac eleifend nulla eleifend. Donec placerat tincidunt libero sed hendrerit. Cras ex velit, lobortis ut ipsum vel, vulputate sodales ex. In pretium, ante id efficitur sollicitudin, purus velit fermentum nulla, ut blandit eros orci ac ex. Duis fermentum, arcu nec molestie fermentum, sapien augue convallis elit, a dictum dui lacus id lorem.\n" +
            "\n" +
            "Pellentesque nisi eros, rhoncus at felis eu, placerat aliquet lacus. Aliquam quis mauris porttitor, pellentesque diam ut, scelerisque nulla. Aliquam dui nunc, fringilla at auctor ac, pharetra sodales lectus. Suspendisse viverra tellus dapibus, venenatis dolor ac, varius tellus. Donec sit amet rutrum nisl, ac pellentesque risus. Morbi elementum orci vel turpis condimentum commodo. In hac habitasse platea dictumst.\n" +
            "\n" +
            "Suspendisse aliquam egestas tellus ac sodales. Morbi eu placerat nunc. In ut sagittis eros. Nam quis velit ut ligula tincidunt condimentum venenatis sit amet sem. Quisque nec maximus orci, at lobortis justo. Ut pretium accumsan lobortis. Mauris et placerat lectus. In fringilla, libero sit amet pharetra ultricies, leo est pharetra odio, sed tempor nulla felis quis ligula. Proin erat eros, mollis sit amet ante vitae, maximus ultrices mauris. Donec a consectetur justo. Morbi volutpat at diam ac auctor. Quisque nibh magna, dictum ac tempus in, egestas eu sapien. Cras eleifend sapien vitae orci elementum laoreet. Morbi tincidunt a diam id hendrerit.\n" +
            "\n" +
            "Mauris a pharetra odio. Etiam ut tempus enim, sed feugiat diam. Aliquam nec mattis nulla, vitae commodo ante. Quisque pharetra eget libero eget sagittis. Suspendisse vitae libero tellus. Aliquam a est ipsum. Quisque luctus erat id arcu scelerisque sodales. Pellentesque a felis gravida, finibus libero eu, accumsan dui. Vivamus vel tristique mauris. Donec maximus tempor dictum. Vivamus sed erat non quam cursus consequat pulvinar sit amet sem. Cras sodales commodo libero, in placerat magna. Suspendisse potenti.\n" +
            "\n" +
            "Nam orci mi, imperdiet quis mollis eu, efficitur id massa. Sed molestie nisl eu dolor accumsan, a consequat justo molestie. Donec fermentum lacinia nunc, vel varius felis. Quisque interdum urna nisi, et euismod sapien scelerisque ut. Nam turpis leo, sagittis a magna ac, egestas eleifend diam. Aliquam est enim, ullamcorper vel ultrices quis, tincidunt eget magna. Nam eget neque sed mi dapibus ullamcorper et pellentesque neque. Nullam iaculis sagittis lacus in maximus. Aliquam lectus ipsum, euismod a nisl quis, posuere rutrum enim.\n" +
            "\n" +
            "Donec a imperdiet diam. In vel arcu nisi. Ut sit amet sollicitudin felis, vitae blandit erat. Sed euismod turpis ligula, ut placerat urna vestibulum eget. Sed laoreet velit sit amet velit maximus faucibus. Duis non odio sed odio accumsan rutrum ut vitae libero. Ut tincidunt porta sodales. Cras leo ante, faucibus vitae nisl at, dictum pretium magna. Nam sed diam dui. Proin lorem neque, vestibulum at gravida eget, lacinia eget magna. Etiam iaculis, lacus et sollicitudin consequat, tellus turpis ullamcorper metus, vel scelerisque neque urna sed leo. Fusce varius tortor eget fringilla porta. Maecenas malesuada blandit dui et accumsan.\n" +
            "\n" +
            "Etiam massa nunc, ullamcorper in arcu ut, tincidunt elementum lectus. Suspendisse felis sapien, rhoncus sit amet ipsum vel, finibus tincidunt nulla. Mauris sodales velit eget purus auctor, sit amet consequat enim dapibus. Vestibulum rutrum tempor volutpat. Proin lectus ante, eleifend quis metus nec, dictum pulvinar risus. Maecenas molestie efficitur est eget rutrum. Aliquam sed eros est. Pellentesque maximus odio fermentum, lacinia felis sit amet, pulvinar libero. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Aliquam ac arcu rutrum, sodales dui at, finibus felis. Nulla facilisi. Nam porta, eros nec finibus pharetra, neque tellus porta felis, at interdum arcu urna sit amet urna. Ut at nisi nisi.\n" +
            "\n" +
            "Quisque efficitur nisl vel imperdiet suscipit. Donec vel gravida erat. Vivamus tincidunt, dui a venenatis suscipit, ligula lorem dapibus diam, non scelerisque nunc arcu vitae tellus. Praesent id suscipit elit. In tristique mollis felis, id ultrices elit. Suspendisse augue purus, vulputate vitae metus in, interdum tempor nisi. Fusce congue nisi non posuere lacinia. Integer aliquam ex quam. Nullam scelerisque lorem quis nibh placerat finibus. Donec sit amet euismod magna. Curabitur maximus pellentesque felis et mattis. Vestibulum nec maximus metus, at egestas libero. Proin fermentum volutpat consectetur. Sed fermentum cursus euismod. Phasellus tristique mauris ut ultricies dignissim. Nullam iaculis tortor et nunc eleifend dapibus.\n" +
            "\n" +
            "Sed rutrum nec mauris non posuere. Donec risus lectus, ultricies a sem non, euismod lacinia est. Nunc convallis nulla at ligula volutpat, sed sagittis neque venenatis. Cras id urna eget ipsum rhoncus mattis sed sit amet turpis. In dignissim, augue a tempor pulvinar, nisl lorem cursus est, vel condimentum risus nisl in ex. Pellentesque malesuada elit quis euismod auctor. Ut rhoncus facilisis mattis. Maecenas id gravida purus, eu vehicula quam. Donec non lorem sit amet ipsum accumsan ullamcorper in sit amet mi. Praesent velit sem, pharetra quis molestie id, suscipit eget velit. Nam odio leo, porttitor vitae justo id, molestie fringilla risus. Sed gravida imperdiet semper. Vivamus sagittis, tellus ac cursus facilisis, purus tortor congue tellus, in dignissim massa urna ut mi. Duis euismod iaculis nisi, nec mattis est tempor ac.\n" +
            "\n" +
            "Suspendisse sit amet augue in risus lobortis ornare sed at est. Nulla rutrum efficitur dui, ut volutpat libero viverra at. Integer eget neque augue. Quisque dignissim condimentum aliquam. Praesent volutpat pretium mauris id luctus. Donec magna turpis, ultricies quis condimentum vitae, facilisis ut lacus. Donec imperdiet mi in felis euismod maximus. Morbi hendrerit nisi placerat, faucibus nibh ut, finibus erat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;\n" +
            "\n" +
            "Suspendisse eleifend velit et lacus congue venenatis. Donec eu nulla vitae arcu condimentum semper. Morbi semper finibus consequat. Praesent eu nulla quam. In iaculis elit vel sem ultricies viverra. Pellentesque sit amet libero nec massa tempus lacinia. Quisque sit amet lobortis orci, sed elementum dolor. Nunc dignissim, magna vel egestas scelerisque, mi ipsum pretium mauris, ut egestas orci lorem at nulla. Nunc ut justo vel augue rhoncus placerat et ac metus.\n" +
            "\n" +
            "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean scelerisque massa vel vehicula gravida. Nunc in dapibus dui. Fusce maximus risus metus, eu rutrum metus imperdiet vitae. Phasellus ut velit vehicula, molestie felis eu, semper ante. Donec lobortis diam mi, ut malesuada massa venenatis id. Maecenas ornare quam non mauris venenatis ornare eget vitae nibh. In ac facilisis sapien.\n" +
            "\n" +
            "Aenean quis mauris sit amet mi suscipit cursus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ut orci elit. Suspendisse ultrices ligula nec aliquet tempor. Duis aliquam nulla id elementum condimentum. Aliquam diam urna, convallis a nunc non, placerat dapibus tellus. Maecenas sed ex eu nisl dignissim condimentum quis vitae augue. Sed eu euismod justo, sed tempor quam. Nullam auctor orci dictum lorem malesuada iaculis. In imperdiet quam quis porttitor suscipit.\n" +
            "\n" +
            "Aenean porttitor nec metus in tincidunt. Aliquam rhoncus venenatis lorem, nec tempor dui imperdiet in. Quisque blandit eget magna ac tempor. Donec dictum dapibus leo nec venenatis. Sed in tortor faucibus, dignissim purus ac, vestibulum lacus. Cras lacinia facilisis sem quis semper. Pellentesque porttitor sed est vitae bibendum. In aliquam ipsum at nisl pretium, vitae tristique metus imperdiet. Nulla placerat orci sit amet dignissim cursus. Nam rhoncus iaculis felis non posuere. Aliquam quis nibh ut nisi faucibus dapibus. Phasellus viverra justo at felis pretium luctus. Nullam ut eros quis magna euismod lacinia vitae sit amet magna. Sed eget lacus eleifend, pharetra nunc in, ultricies dolor.\n" +
            "\n" +
            "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nullam eu efficitur libero, eu pellentesque mi. Sed at metus sit amet turpis vestibulum convallis. Nulla porttitor dapibus est nec porta. Vestibulum lobortis lacus et dapibus commodo. Etiam vel rutrum ante. Fusce viverra ullamcorper eleifend. Aliquam libero nibh, lobortis eget porttitor vitae, gravida id sapien. Integer nec ipsum vel magna imperdiet pretium egestas in elit. Quisque sed elementum lacus. Ut vestibulum felis at dolor dapibus, eu consequat turpis scelerisque. Fusce ipsum est, dignissim at efficitur varius, rhoncus fermentum arcu. Praesent vitae tincidunt ante.\n" +
            "\n" +
            "Integer gravida non mauris a semper. Cras dignissim aliquet faucibus. Nullam in rutrum lorem. Morbi vel finibus metus, at luctus augue. Fusce id sodales erat. Etiam porttitor turpis et ex rutrum, nec ultrices purus iaculis. Sed eget lorem nec dui venenatis tincidunt vitae id orci. Ut non nisi scelerisque, sagittis sapien eget, sagittis velit. Maecenas hendrerit erat magna, at bibendum ipsum pulvinar ut. Duis varius gravida arcu, eget sagittis leo interdum eget. Sed a nibh dolor.\n" +
            "\n" +
            "In interdum egestas pulvinar. Vestibulum id arcu laoreet, porttitor libero sed, sollicitudin est. Morbi eu massa mattis, molestie risus at, gravida magna. Proin hendrerit malesuada enim et congue. Etiam auctor nisl quam, sit amet pharetra orci posuere sit amet. Etiam lectus urna, venenatis a lorem vel, eleifend fermentum nulla. Cras tempus varius purus in porttitor. Nulla facilisi. Donec fermentum dolor a eleifend aliquet. Cras sapien est, placerat congue convallis quis, varius eget leo. Aenean ullamcorper felis vitae sapien venenatis, nec pharetra justo molestie. Donec cursus, urna ut ornare laoreet, nunc nisi volutpat tortor, sit amet euismod elit mauris ac orci. Cras lectus purus, pellentesque ac neque at, lacinia iaculis dui. Phasellus sagittis neque id diam sodales, blandit congue tellus convallis. Aliquam in neque felis.\n" +
            "\n" +
            "Mauris mollis augue orci, ut tincidunt felis accumsan id. Donec non condimentum neque. Phasellus pellentesque est diam, vitae aliquet est pretium sed. Suspendisse tempus aliquet consequat. Nunc faucibus mauris ipsum, nec aliquet enim mattis vitae. Integer sagittis eu augue sit amet finibus. Suspendisse malesuada pretium suscipit. Phasellus eleifend porta eros aliquet feugiat. In congue non quam vel molestie. Aliquam suscipit eget risus sit amet varius.\n" +
            "\n" +
            "Nulla fringilla lectus quis lacinia sollicitudin. Vivamus tellus augue, efficitur ut tempor vel, sagittis ac eros. In nulla massa, imperdiet dignissim diam at, efficitur venenatis arcu. Nullam tristique enim at mollis consectetur. Nulla tincidunt quis nibh ut sollicitudin. Suspendisse volutpat vel quam non eleifend. Donec congue sagittis porttitor. Proin vitae augue vitae enim rhoncus vulputate quis a eros. Sed quis faucibus ipsum. In hac habitasse platea dictumst. Sed vitae congue augue. Curabitur vel ullamcorper eros. Proin mauris tellus, hendrerit pharetra dolor id, posuere convallis nibh. Nam porta fringilla arcu ac commodo.\n" +
            "\n" +
            "Morbi lacinia tempor interdum. Praesent magna nisi, molestie ut magna vel, imperdiet dictum mauris. Donec lobortis feugiat ante et bibendum. Nunc id ante sed velit viverra pharetra. Donec vel tincidunt eros, vel ornare augue. Curabitur nec nunc in tellus luctus bibendum. Duis sagittis fringilla rhoncus. Maecenas quis imperdiet turpis.\n" +
            "\n" +
            "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec in mattis justo. Phasellus lobortis quam eget mauris tincidunt imperdiet. Vivamus blandit interdum dui a iaculis. Maecenas eget tristique metus. Duis quis ligula vitae ante imperdiet lacinia vel id lorem. Pellentesque suscipit nec est at condimentum.\n" +
            "\n" +
            "Mauris sed finibus massa, nec cursus dolor. Morbi ultrices porttitor turpis, vulputate condimentum magna aliquam a. Nam a mauris vel ipsum convallis laoreet. Maecenas dui libero, sagittis pretium massa quis, pulvinar ultricies urna. Cras efficitur tristique sollicitudin. Curabitur vel quam ut odio consequat dignissim. Integer et sapien facilisis, aliquet augue et, fermentum augue. Pellentesque scelerisque ultrices tellus quis tincidunt. Aliquam erat volutpat. Nulla sit amet faucibus ipsum. Aenean vitae quam elit. Curabitur tempus urna nec tincidunt mattis. Duis sit amet dolor quis arcu euismod vehicula eu ut libero. Morbi sed libero non mauris pulvinar hendrerit. Sed eget urna elementum dolor mollis sodales in at nulla. Cras tristique, diam nec tincidunt feugiat, mi odio auctor massa, vitae volutpat lacus eros nec metus.\n" +
            "\n" +
            "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aliquam ultricies mollis est, ac bibendum augue porta eget. Praesent eleifend lectus non sapien bibendum vestibulum. Donec eget ipsum nibh. Nulla pellentesque hendrerit libero sit amet ultricies. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Curabitur sodales orci id quam fermentum faucibus. Sed at arcu augue. Etiam fermentum sapien ex, in feugiat lectus dictum ut. Quisque vel turpis ullamcorper, ullamcorper nisi at, laoreet purus.\n" +
            "\n" +
            "Integer urna ex, faucibus nec commodo sed, accumsan in nisl. Sed placerat placerat enim a viverra. Aenean porttitor velit vestibulum lectus viverra bibendum. Sed id sapien egestas, laoreet urna vel, gravida augue. Phasellus iaculis massa enim, non elementum ligula elementum ut. Nunc luctus sollicitudin justo, luctus convallis mauris malesuada ut. Maecenas porta neque eget dapibus blandit. Vivamus at molestie neque. Donec nec egestas justo, quis vestibulum eros. Integer et hendrerit nisi.\n" +
            "\n" +
            "Nunc porttitor laoreet consectetur. Interdum et malesuada fames ac ante ipsum primis in faucibus. Cras dictum tristique sem, eget pellentesque augue suscipit vel. Nullam vel finibus dui. Nullam ante ex, congue consectetur odio congue, euismod molestie nisl. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Mauris a rutrum arcu, sed vehicula turpis.\n" +
            "\n" +
            "Aliquam in cursus nunc. Aenean tincidunt nisl sed eros sagittis tristique. Duis nisl erat, laoreet eu lectus consectetur, auctor dictum odio. Maecenas dignissim luctus ipsum, sed pellentesque risus rhoncus at. Donec venenatis bibendum tortor, vitae blandit turpis elementum ac. Sed dui enim, ultricies et blandit id, placerat eget tellus. Nunc non pharetra turpis, ac blandit urna. Aliquam ultricies nisi maximus nulla dignissim sagittis. Etiam in luctus velit. Duis rutrum felis sed ipsum elementum, vitae pulvinar tellus placerat. Cras iaculis risus a risus pretium, at interdum massa rutrum.\n" +
            "\n" +
            "Nulla dapibus mauris in libero ultrices lobortis. Praesent dictum ipsum facilisis mi suscipit, nec egestas felis eleifend. Integer elit quam, blandit sit amet tincidunt eu, sollicitudin a magna. Mauris ut felis sodales, pulvinar elit nec, pharetra dolor. Vestibulum sodales lorem ac luctus varius. Fusce non leo cursus, iaculis erat quis, ullamcorper lacus. Mauris ac ultrices ante. Fusce in viverra mi, lacinia cursus massa.\n" +
            "\n" +
            "Sed feugiat sit amet diam et pretium. Nullam cursus lobortis tristique. Etiam bibendum tortor nec finibus aliquam. Praesent et lorem id arcu vehicula ultrices eu nec mi. Integer finibus cursus nisi, in varius tortor efficitur eu. Quisque at volutpat lectus. Duis malesuada lorem eu ornare scelerisque. Nunc non libero augue.\n" +
            "\n" +
            "Quisque laoreet sem ut ipsum tempus commodo. Aliquam cursus iaculis nulla, eget posuere magna lobortis in. Proin sed facilisis nisl. Integer magna tortor, tempus at leo id, mattis pulvinar justo. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin et velit ut massa vehicula dignissim. Morbi suscipit nulla vitae turpis tincidunt, eu lacinia erat congue. Sed ut mollis arcu. Nullam nec accumsan nunc, ac posuere augue. Praesent ligula justo, varius eu justo non, semper condimentum lectus. Sed ultrices interdum ex. Vestibulum massa est, ornare imperdiet pulvinar ut, vehicula ut odio. Duis ornare velit nec enim aliquam, sed fringilla risus tempor.";


}