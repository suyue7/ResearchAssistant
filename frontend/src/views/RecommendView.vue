<template>
  <div class="content-section">
    <div class="recommendation-list">
      <div class="paper-card" v-for="(paper, index) in recommendedPapers" :key="index">
        <h3>{{ paper.title }}</h3>
        <p class="meta">{{ paper.author }} · {{ paper.date }}</p>
        <p class="abstract">{{ paper.abstract }}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'RecommendView',
  data() {
    return {
      recommendedPapers: [
        {
          title: "Deep Learning Applications in NLP",
          author: "Wei Zhang et al.",
          date: "2023-05-15",
          abstract: "This paper reviews recent applications of deep learning techniques in natural language processing...",
        },
        {
          title: "Transformer-based Text Generation Methods",
          author: "Li Hua et al.",
          date: "2023-03-22",
          abstract: "This paper explores the advantages and limitations of Transformer architecture in text generation tasks...",
        },
        {
          title: "Transformer-based Text Generation Methods",
          author: "Li Hua et al.",
          date: "2023-03-22",
          abstract: "This paper explores the advantages and limitations of Transformer architecture in text generation tasks...",
        },
        {
          title: "Transformer-based Text Generation Methods",
          author: "Li Hua et al.",
          date: "2023-03-22",
          abstract: "This paper explores the advantages and limitations of Transformer architecture in text generation tasks...",
        },
        {
          title: "Transformer-based Text Generation Methods",
          author: "Li Hua et al.",
          date: "2023-03-22",
          abstract: "This paper explores the advantages and limitations of Transformer architecture in text generation tasks...",
        },
        {
          title: "Transformer-based Text Generation Methods",
          author: "Li Hua et al.",
          date: "2023-03-22",
          abstract: "This paper explores the advantages and limitations of Transformer architecture in text generation tasks...",
        },
      ],
    };
  },
};
</script>

<style scoped>
.content-section {
  text-align: center; /* Center text horizontally */
}

.recommendation-list {
  display: flex;
  flex-wrap: wrap;           /* ✅ 多行布局 */
  justify-content: center;   /* ✅ 居中对齐 */
  gap: 1.5rem;               /* ✅ 卡片间距 */
  margin-top: 2rem;
}

.paper-card {
  background-color: #e4ecef;
  padding: 1.5rem;
  border-radius: 8px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  width: 40%;               /* ✅ 一行两个卡片 */
  min-width: 300px;         /* 防止卡片太窄 */
}


.paper-card h3 {
  color: #1a365d;
  margin-bottom: 0.5rem;
  font-size: 1.2rem;
}

.meta {
  color: #666;
  margin-bottom: 0.5rem;
  font-size: 0.9rem;
}

.abstract {
  color: #333;
  line-height: 1.6;
}
</style>
