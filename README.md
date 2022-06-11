<h1 align="center">
Bangkit Team C22-PS200
</h1>
<p align="center">
Capstone for Bangkit 2022
</p>

<p align="center">
<img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-4.3.1-blue?logo=kotlin">
<img alt="Android Studio" src="https://img.shields.io/badge/Android%20Studio-4.1.2-green?logo=android-studio">
<img alt="Android" src="https://img.shields.io/badge/Android-3DDC84?logo=android&logoColor=white">
<img alt="TensorFlow" src="https://badges.aleen42.com/src/tensorflow.svg">
<img alt="Firebase" src="https://img.shields.io/badge/firebase-%23039BE5.svg?logo=firebase"/>
<img alt="Google Cloud" src="https://img.shields.io/badge/-Google%20Cloud-FFFFFF?logo=google-cloud&style=plastic"/>
<img alt="Bootstrap" src="https://img.shields.io/badge/-Bootstrap-FFC300?logo=bootstrap&style=plastic"/>
<img alt="Figma" src="https://img.shields.io/badge/Figma-645803?logo=figma&style=plastic"/>
</p>

# Member
1. Nazirman (A2122F1546) - Politeknik Caltex Riau
2. Farel Jevon (A2004F0391) - Institut Teknologi Sepuluh Nopember
3. Alexander Nicolas Wonoadi (M7004F0183) - Institut Teknologi Sepuluh Nopember
4. Safirah Melinia Febyanti (M2004F0184) - Institut Teknologi Sepuluh Nopember
5. Elisa Nur Yuliantika Ardani (C2312F2697) - Universitas Sebelas Maret
6. Gregorius Michael Sela (C2009F0940) - Universitas Gunadarma

## Theme : Healthcare
### Title of Project : Mobile Application to Help Alzheimer Disease Patient (CAREZHEIMER)

### Summary of Project
Alzheimer sufferers have difficulties taking care of themselves and families of Alzheimer disease patients also unable to take care of Alzheimer sufferers full time. This prevents the caretakers from doing their daily activities. Alzheimer is a common form of dementia that causes a decrease in a person’s cognitive abilities which results in difficulty while carrying out routine activities. Based on the Indonesia's Ministry of Health, the number of people with Alzheimer disease in Indonesia (2013) reached one million people. That number will continue to increase every year, and is expected to reach four million people by 2050. Caring for patients is very difficult, where the lack of knowledge about how to care for patients makes the family feel stressed and in the end some of them give up on their daily activities that would affect their economic and social status. 
## Steps to replicate this project
### Machine Learning
1. Research about Collaborative Filtering
2. Create Dataset (for Demo Purpose)
3. Preprocessing dataset (Remove punctuation, remove affixes, dividing data to prepare for ML training)
4. Create deep learning model using Collaborative Filtering Recommendation System
5. Save and load model, and then convert to TFLite to evaluate performance and deploy in android.

### Mobile Development
1. Design UI layout (optional: Figma)
2. Dependencies (see Technology used part)
3. Navigation
4. Connecting local database to UI (using ViewModel, Room, optional: Flow, Koin, Clean Architecture)
5. Implement external feature (accessing camera and gallery, using QR code and scanner)
6. Connecting to remote (using Firestore for database and Firebase storage for file)
7. Implement machine learning using TFLite

### Cloud Computing

1. Create a project on Google Cloud Platform
2. Create a project on firebase
3. Set default region as asia-southeast2(Jakarta)
4. Set up billing allert on GCP
5. Set up gcloud SDK
6. Enable and set up Map API from GCP API Library
7. Set up Map API credentials and embed it on static web
8. Create .yaml files from root directory and deploy it via gcloud SDK
9. Create a firestore database for the database with collection caretaker, patient, task
10. Create a firebase storage to store user profile picture from mobile app
10. Input machine learning model in Firebase Machine Learning

## Technology used

- [Room](https://developer.android.com/jetpack/androidx/releases/room)
- [Glide](https://github.com/bumptech/glide)
- [Lottie](https://github.com/airbnb/lottie-android)
- [Code Scanner](https://github.com/yuriy-budiyev/code-scanner)
- [Data2viz](https://github.com/data2viz/data2viz)
- [Google Cloud Platform](https://cloud.google.com/gcp)
- [Firebase](https://firebase.google.com)
- [TensorFlow](https://www.tensorflow.org/lite/guide/android)
- [QrGenerator](https://github.com/androidmads/QRGenerator)
- [Bootstrap](https://bootstrapstudio.io)
- [Figma](https://www.figma.com)

## Project Resources
### Budget
Google Cloud Platform Subscription : **$100**

### Design Apps :
[Design](https://www.figma.com/file/7z7Y3YQdNuTdANBJEX8byp/Alzheimer-Project-Capstone?node-id=0%3A1)

### Static landing page URL

[CAREZHEIMER](https://carezheimer.et.r.appspot.com/#about)
