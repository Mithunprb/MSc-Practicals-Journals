# Mini-Project: Handwritten digit classifier using logistic regression

In this mini project we're going to implement from scratch a one-vs-all logistic regression classifier for the [MNIST digits dataset](https://drive.google.com/file/d/1lyP8UkVxEFm6cAhjYXwRUP3k3n0ddTgD/view?usp=sharing) with a neural network mindset. The neural network aspect of this implementation is the use of a forward and backward propagation to claculate the value of the cost function and the partial derivatives of the cost function with respect to weights and the bias.

[![Open In Colab](https://colab.research.google.com/assets/colab-badge.svg)](https://colab.research.google.com/drive/1GkOTH8IbZbztvEqZ_rMvUi1EwhCzNjZ_?usp=sharing)

>[Mini-Project: Handwritten digit classifier using logistic regression.](#scrollTo=BTdQN8rF204b)

>>[Introduction](#scrollTo=waUX8T1T204d)

>>[Download the MNIST dataset](#scrollTo=PnG_C_LH204h)

>>[Importing and preprocessing data](#scrollTo=mBd9-II8204i)

>>[Creating model functions](#scrollTo=kRYqdp1w205C)

>>[Training a test model for the digit "0"](#scrollTo=hwEvhC9V205F)

>>[Training a model for each digit](#scrollTo=gN9ZblSt205G)

>>[Final model for digit classification](#scrollTo=KyJM0jqz205H)

>>[Results](#scrollTo=Xk75f5a1k3FR)

>>[Conclusion](#scrollTo=USR22VSD_M87)

## Requirements

- Gdown
`pip -qq install --upgrade --no-cache-dir gdown`
- Numpy
- Matplotlib
- Scikit-learn
- Scipy
- Pandas
- Seaborn
- imageio
`pip -qq  install imageio`

## Download the MNIST dataset

[MNIST digits dataset](https://drive.google.com/file/d/1lyP8UkVxEFm6cAhjYXwRUP3k3n0ddTgD/view?usp=sharing)

```
gdown 1lyP8UkVxEFm6cAhjYXwRUP3k3n0ddTgD
unzip -qq mnist-original.mat.zip
```

## Results
- GIF
<div id='results', align=center>
  <img src="metadata/output_video.gif" width="600"/>
</div>
