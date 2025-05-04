<template>
  <div class="content-section">
    <div class="search-box">
      <input type="text" v-model="searchQuery" placeholder="请输入关键词：" />
      <button @click="performSearch">搜 索</button>
    </div>
    <div class="search-results">
      <p v-if="searchResults.length === 0">无相关结果</p>
      <div class="results-grid" v-else>
        <div class="paper-card" v-for="(result, index) in searchResults" :key="index">
          <h3>{{ result.title }}</h3>
          <p class="meta">{{ result.author }} · {{ result.date }}</p>
          <p class="abstract">{{ result.abstract }}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'SearchView',
  data() {
    return {
      searchQuery: '',
      searchResults: [],
    };
  },
  methods: {
    performSearch() {
      this.searchResults = [
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
      ];
    },
  },
};
</script>

<style scoped>
.content-section {
  text-align: center;
  padding-bottom: 2rem; /* 防止底部内容被遮住 */
}

.search-box {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  margin-top: 1.5rem;
  margin-bottom: 1rem;
}

.search-box input {
  padding: 0.75rem 1rem;
  width: 13rem;
  font-size: 1rem;
  margin-right: 10px;
  border-radius: 8px;
  border: 1px solid #ddd;
}

.search-box button {
  padding: 0.75rem 1rem;
  background-color: #1a365d;
  color: white;
  border: none;
  border-radius: 8px;
  cursor: pointer;
  font-size: 0.9rem;
}

.search-results {
  margin-top: 20px;
  padding: 0 1rem;
}

.results-grid {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  column-gap: 2rem;
  row-gap: 2rem;
  margin-top: 1rem;
}

/* 与 RecommendView 保持完全一致的卡片样式 */
.paper-card {
  background-color: #e4ecef;
  padding: 1.5rem;
  border-radius: 8px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  width: 40%;
  min-width: 300px;
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
