import { Component } from '@angular/core';
import { HttpClient , HttpParams, HttpHeaders} from '@angular/common/http';
import { Post } from './models/post';
import { Observable } from 'rxjs/internal/Observable';

import { catchError , retry } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'RestCommunication';

  readonly ROOT_URL = 'https://jsonplaceholder.typicode.com';

  posts!: Observable<Post[]>;

  newPost!: Observable<Post | any>;

  constructor(private http: HttpClient){}

  getData(){
    let params = new HttpParams().set('id', '4');
    let headers = new HttpHeaders().set('Authorization', 'jwt-token');
    this.posts = this.http.get<Post[]>(this.ROOT_URL + '/posts', {params, headers});
  }

  createData(){
    let newData: Post = {
      id: 0,
      userId: 44,
      title: 'Hello There',
      body: 'Hello There again'
    };

    // Correct post
    // this.newPost = this.http.post<Post>(this.ROOT_URL + '/posts', newData);

    // Incorrect Post
    this.newPost = this.http.post<Post>(this.ROOT_URL + '/notcorrect', newData)
      .pipe(
        retry(3),
        catchError( err => {
          console.log(err);
          return new Observable<any>(err);
        })
      )

  }
}
