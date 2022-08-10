SDUI Android client

SDUI Android client

# 思考1:Navigation的设计。

Navigation指的是页面之间的跳转，它的设计决定了整个树结构。

Swiftui和Compose上对导航的实现如下。

[NavigationLink for swiftui](https://developer.apple.com/documentation/swiftui/navigationlink?changes=latest_minor)

[Navigating with Compose](https://developer.android.com/jetpack/compose/navigation)

![navigation-design1](/art/nav1.png)

所以怎么设计导航呢。

## 选择1，树结构以链表的形式存在。
树结构中永远只有1个页面，也可以理解为有所有的页面。
只有1个页面的理解。因为链表关系，第一个页面默认显示content，但是它的destination中却是另一个页面的 content + destination。依次链接起来，就是一个页面。

有所有页面的理解。按照上面的解释，这个树结构已经拥有了业务的所有页面，即使来了新的页面，我们可以无限的接在last link的 destination里面。
![navigation-design3](/art/nav3.png)

## 选择2，树结构以数组的形式存在。
这样每个页面互相独立，树结构的初始大小可以是1个，2个或者任意多个。需要某些页面时，我们可向后端申请一页页面增加到树结构。

![navigation-design2](/art/nav2.png)

场景1：登录。

树结构初始化可以有2个页面。 登录页面，注册页面。
登录页面提交表单后，通过结果确认，1、登录成功，向服务端申请新的页面（注意，客户端并不知道这是登录业务，只知道提交了个表单，向后端申请新页面这个动作是后端在表单结果中返回的）；2、登录失败，在当前页面弹框(这个动作也是一样由服务端控制)。
为了体验好一些，点注册时，直接navigate到注册页面。


场景2：微信的聊天列表。

树结构中至少要有列表列表中Conversation个数的页面，我们不希望点击条目的时候才去服务端获取当前这个人的聊天详情页面（也可以这样做）。

这个时候，我们可能会思考，按照理想的设计，每个人的聊天页面都是一样的模板（有些公众号，系统账号可能有差异），为什么不能有2个页面就足够了？
因为这个页面是服务端给的，它把树结构传递给客户端的时候，这个页面的所有信息已经是确定的了，包括显示什么，动作等，树结构在客户端的内存中，相当于是离线版。
所以树结构中最好有Conversation count的页面的页面个数，每个人的详情都在树结构中。

联想到另外一个场景，你打开这个页面的时候没有和A聊天，A突然给你发了消息。或者你在列表页看到了A，但是A一直给你发消息。这两种情况都会造成详情页面的变化（至少消息多了一条）。我们所谓的离线版怎么更新呢。  这个可以单独在讨论，我们可以用热加载来搞定它。


# 思考2：页面之间的数据传递。

