程序是用java语言来写的，在Intellij IDEA上运行
该程序由四个类组成
Main.java       该程序的入口
IniFrame         页面置换算法初始化界面
Paging.java    页面置换功能页面，用来展现三种算法的置换过程，并算出对应的                         缺页率，再进行比较得出最优算法
Dynamic.java  页面置换算法动态演示界面

运行过程：
        首先在Main.java中调用IniFrame类的构造函数，然后在IniFrame的构造函数中实现了页面置换算法的初始化界面，并且实例化随机生成按钮响应事件，如果点击了随机生成按钮就会调用actionPerformed（）来随机生成页面，并调用PagingFrame的带参构造函数，参数是物理块号和存有页面的数组，然后在PagingFrame的构造函数中实现三种算法，并用图表将它们展示出来。除此之外，在页面置换功能页面还有动态演示的按钮，如果点击它就会调用Dynamic.java中的onestep()方法，实现自动运行或者手动运行。