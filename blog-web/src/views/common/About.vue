<template>
  <div>
    <div id="about">
      <div class="wrap">
        <Header></Header>
        <div class="content">
          <h2>About</h2>
          <p style="color:#f3c0cb">声明：本站所有文章均为本人原创，仅代表个人思想，与其他任何人或组织无关！</p>
          <h2>个人介绍</h2>
          <p>zjy</p>
          <p>learn</p>
          <p>作者github：</p>
          <a href="https://github.com/civitasv">Github@Civitasv</a>
        </div>
      </div>
      <Footer></Footer>
      <GoTop></GoTop>
    </div>
    <SideBar></SideBar>
  </div>
</template>

<style scoped>
#about {
  background-image: url("../../assets/images/bg.jpg");
  background-size: cover;
  background-attachment: fixed;
  background-repeat: no-repeat;
  transition: margin-right 1s;
}
.wrap {
  min-height: 100vh;
  padding-bottom: 100px;
}
.content {
  width: 80vw;
  border-radius: 0;
  margin: 0 auto;
  margin-top: 10vh;
  color: whitesmoke;
  line-height: 3rem;
}
.content a {
  color: whitesmoke;
}
</style>
<script>
const Header = () => import("../../components/Header");
const Footer = () => import("../../components/Footer");
const GoTop = () => import("../../components/GoTop");
const SideBar = () => import("../../components/SideBar");

export default {
  data() {
    return {};
  },
  computed: {},
  components: {
    Header,
    Footer,
    GoTop,
    SideBar
  },
  methods: {}
};
</script>
