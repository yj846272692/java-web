package com.bo.listener;

import com.bo.entity.Book;
import com.bo.entity.User;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/2/24
 */
@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /**
     * 容器初始化方法
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动...");

        List<User> userList = new ArrayList<>(3);

        User[] users = {
                new User(1, "111@qq.com", "123456", "一号选手", "user2.jpg", "南京", LocalDate.of(2022, 2, 22)),
                new User(2, "222@qq.com", "123456", "二号选手", "user2.jpg", "南京", LocalDate.of(2022, 2, 22)),
                new User(3, "333@qq.com", "123456", "三号选手", "user3.jpg", "南京", LocalDate.of(2022, 2, 22)),
        };

        userList = Arrays.asList(users);

        List<Book> bookList = new ArrayList<Book>(10);

        Book[] books = {
                new Book(1, "索拉里斯星 ", "1.jpg", "[波] 斯坦尼斯瓦夫·莱姆/译林出版社/2021-8", "索拉里斯星是一颗围绕双星运转的星球，表面被胶质海洋覆盖。根据人类既有的认知，这样的星球的运转轨道应该是不稳定的。但仅仅过了十几年，人们就发现，索拉里斯星的轨道并没有显示出预期的变化。这激发了人类对这颗星球无限的兴趣。\n" +
                        "\n" +
                        "心理学家凯尔文降落到索拉里斯星，迎接他的不是同伴们的热烈欢迎，而是杂乱的太空站、疯癫的科研人员和凝重的暗黑气氛，他试图弄清楚到底发生了什么，直到在一片扑朔迷离中撞见自己已经过世十年的妻子……"),
                new Book(2, "三只忧伤的老虎 ", "2.jpg", "[古巴] 吉列尔莫·卡夫雷拉·因凡特/四川人民出版社/2021-7", "本书是古巴作家因凡特的代表作，是拉美“文学爆炸”风潮中最独特、最具实验性的作品之一。这本小说没有明确的故事线，开篇的场景是50年代哈瓦那最著名的夜店，经主持人介绍，一干人物纷纷亮相。而全书结构与此呼应，不同人物上场、下场，以其独特的视角和声音呈现一段“剧目”，各个篇章共同构成一场盛大而炫目的演出。小说描写了50年代末哈瓦那的几位艺术家，但真正的主角并不是他们，而是文学、电影、音乐以及回忆中的城市本身。"),
                new Book(3, "鄙视", "3.jpg", "[意] 阿尔贝托·莫拉维亚/江苏凤凰文艺出版社/2021-7", "婚后两年，丈夫在工作、金钱和理想面前节节败退，妻子的鄙视成了对他而言最大的惩罚。他时时揣摩自己为什么被妻子鄙视，却把妻子越推越远，一桩原本幸福的婚姻即将轰然崩塌。"),
                new Book(4, "成年人的谎言生活 ", "4.jpg", "[意大利] 埃莱娜·费兰特/人民文学出版社/2021-8", "《成年人的谎言生活》（2019）是意大利作家埃莱娜•费兰特继“那不勒斯四部曲”之后的最新一部作品，聚焦于出身那不勒斯中产家庭的女孩乔瓦娜的青春和成长。\n" +
                        "\n" +
                        "在她父亲离家两年前，十二岁的乔瓦娜偶然听到父亲对母亲说自己很丑，越来越像他一直嫌恶的妹妹维多利亚，这句话驱使乔瓦娜第一次走向那不勒斯下城，面对父亲抛在身后的卑贱过往。"),
                new Book(5, "海边的房间", "5.jpg", "黄丽群/理想国｜河南文艺出版社/2021-8", "台湾新生代小说家黄丽群的代表短篇小说集，十二个坏掉的人，十二个令人倒吸一口凉气的好故事。小说家熬制典雅细密的汉语，精巧布局，将人间悲欢斩落整齐，写出一个城市畸爱者的幽冷世界：老公寓里的弃女和养父，乡间卜算师与患病的儿子，梦游的宅男，中年独居女人和三花猫……语言的俏皮与一 个个意料之外被冻住的结尾，以及对平凡人事细致入微的体察，构成作品特有的文字张力。无常往往最平常，老灵魂的世情书写，温热冷艳，拨动平凡市井里的人心与天机，失意人的情欲与哀伤，我们日常的困顿与孤独。"),
                new Book(6, "齐马蓝", "6.jpg", "[英] 阿拉斯泰尔·雷诺兹/湖南文艺出版社/2021-7", "2019年，Netfilx 播出 大卫·芬奇 监制剧集《爱，死亡和机器人》。天马行空的想象力、不拘一格的表现形式、深邃厚重的思想内涵征服了整个二次元世界，《爱死机》迅速成为全球热议的现象级爆品。作为大卫·芬奇的御用编剧，雷诺兹亲自操刀改编了自己的短篇小说《齐马蓝》《天鹰座裂隙之外》，由《齐马蓝》改编的《齐马的作品》也被全球观众公选为《爱死机》第一季的 TOP1 佳作。"),
                new Book(7, "鹿川有许多粪", "7.jpg", "李沧东/武汉大学出版社/2021-8", "这部小说集展现了一批裹挟在复杂多变的历史浪潮中的底层人物形象，他们艰辛地在生活中追求真正的价值，与现实中的痛苦进行抗争，同时寻找个人生活的意义。作者通过这些人物的遭遇审视韩国现实，但并非止步于讲述历史事件或故事本身，而是着重刻画了人物在此过程中发生的转变，他们逐渐开始对生活中的真正价值和自己的身份认同提出疑问并进行探索"),
                new Book(8, "浮木", "8.jpg", "杨本芬/北京联合出版公司/2021-7-2", "《浮木》是《秋园》的续集。一位八旬奶奶讲述她和妈妈，以及中南腹地那些家人、亲戚、乡亲们的故事，在那样的年代里，人们像水中的浮木般起起伏伏、随波逐流、挣扎求生，他们的命运在大时代中载浮载沉、漂泊无向，有的从此破碎，有的尚有一线生机。文字中涉及的人物，其生命多数不复存在， 恰如泡影破灭于水面，闪电消失于天空。作者通过回忆，讲述了中国人民生生不息的坚韧与美好，这一生，像是一颗露珠的记忆，微小，短暂。但在露珠破灭之前，那也是闪耀着晶亮光芒的，是一个完整的宇宙。\n" +
                        "\n"),
                new Book(9, "焦虑的人", "9.jpg", "弗雷德里克·巴克曼/天津人民出版社/2021-8", "究竟是何种程度的无奈和绝望，迫使一个中年人在新年来临前的早晨，用一把玩具枪抢劫一家无现金银行。行动失败的劫匪仓皇之中逃进一间位于大楼顶层的待售公寓，里面全都是正在看房子的潜在买家。由此开始，抢劫案变成了劫持人质案。\n" +
                        "\n" +
                        "然而事情的发展出乎预料，没有警匪对峙、没有致命一击，漫长的一天过后，八名人质安然无恙得到释放，劫匪却完全不见踪影。警察对人质逐一展开讯问，却发现他们每个人都有一肚子的抱怨和疑问，可是谁也说不清楚并且不关心劫匪究竟去了哪里。"),
                new Book(10, "无名之町", "10.jpg", "[日本] 东野圭吾/南海出版公司/2021-7", "退休前，他是小镇上人人爱戴的老师，亲切又有威信，陪伴许多孩子长大成人。\n" +
                        "\n" +
                        "三周前，神尾老师收到同学们邀请，答应参加他们毕业十五年的同学聚会。\n" +
                        "\n" +
                        "一周前，神尾老师在自家后院被杀害，尸体被上门拜访的学生发现。\n" +
                        "\n" +
                        "同学聚会当天，在以前上课的教室里，活跃于各行各业的学生们坐在了一起：银行职员、居酒屋老板、IT公司社长、人气漫画家……\n" +
                        "\n" +
                        "只听哗啦一声，教室的前门开了。\n" +
                        "\n" +
                        "门口站着的，是已经死去的神尾老师。\n" +
                        "\n"),
        };

        bookList = Arrays.asList(books);
        // 获取全局变量
        ServletContext servletContext = sce.getServletContext();
        //设置全局变量属性，将用户和图书列表数据计入，整个应用可以共享
        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("bookList", bookList);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁...");
    }


}
