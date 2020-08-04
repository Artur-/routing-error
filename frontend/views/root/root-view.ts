import { LitElement, html, css, customElement } from 'lit-element';

@customElement('root-view')
export class RootView extends LitElement {
  static get styles() {
    return css`
      :host {
        display: block;
      }
    `;
  }

  render() {
    return html`
      <br />
      Content placeholder
    `;
  }
}
